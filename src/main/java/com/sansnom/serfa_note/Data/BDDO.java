/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note.Data;

/**
 *
 * @author DevInfo
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class BDDO{
	
	private Connection connection;
	
	public BDDO(){
		try
			{

			  //Load Driver
			    Class.forName("org.mariadb.jdbc.Driver");
                          //Establish the connection to the database 
                          Identifiants ids = new Identifiants();
			  this.connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/applinotes",
									ids.getId(),
									ids.getPswd());  
			}
		catch (ClassNotFoundException | SQLException e)
			{
			  System.err.println("Connection failed. Got error:"); 
			  System.err.println(e.getMessage()); 
			} 
		}
	
        private ResultSet ExecuteQuery(String query,String data[]){
            //System.err.println(query);
            int returntype ; //Type de retour:resultat pour les select, id de l'entrée affectée pour les autres
            char first = query.charAt(0) ;
            switch (first) { // Check la première lettre de la requete pour differentier select des autres
                case 'S':
                    returntype = 1;
                    break;
                case 'D':
                case 'I':
                case 'U':
                    returntype = 0;
                    break;
                default:
                    return null;
            }
            try {       //Mise en place du statement
                PreparedStatement stmnt;
                if(returntype==0){stmnt = this.connection.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);}
                else{stmnt = this.connection.prepareStatement(query);}
                        //Insertion des données dans le statement
                for(int i=0;i<data.length;i++){stmnt.setString(i+1,data[i]);}
                ResultSet res ;
                        //Gestion des types de retours
                if(returntype==1){
                    res = stmnt.executeQuery();
                    }
                else{
                    stmnt.executeUpdate();
                    res =stmnt.getGeneratedKeys();
                }
                return res;
            } catch (SQLException ex) {
                System.err.println("Statment couldn't be built. Got error:"); 
		System.err.println(ex.getMessage());
                return null;
            }         
        }
        
        private int KeyRead(ResultSet set){ //Lit un ResultSet obtenu après un insert/delete/update
        
        try {
                if (set.next()){return set.getInt(1);}
            } catch (SQLException ex) {
                System.err.println("Statment couldn't be read. Got error:"); 
		System.err.println(ex.getMessage());
            }
        return -1;
        }
        
        
        //Users
	public int InsertUser(String username,String password){ //Ajoute un user a la BDD et renvoie son id
        
        String[] values = {username,password};
            
        ResultSet key = this.ExecuteQuery("INSERT INTO Utilisateur (identifiant,motDePasse) VALUES (?,?);",values);
        

        return this.KeyRead(key);
        }
	
	public int ConnectUser(String username,String password){ //Vérifie si une combinaison username/password est dans la table Utilisateurs
            
        String[] values = {username,password};
        
        ResultSet data = this.ExecuteQuery("SELECT * FROM Utilisateur WHERE identifiant= ? AND motDePasse = ? ;",values);
        
            try { //Pas besoin du contenu, on vérifie juste si l'on a une réponse.
                if(data.next()){return data.getInt("idUtilisateur");}
                else{return -1;}
            } catch (SQLException ex) {
                System.err.println("Couldn't acces results from query");
                return -1;
            }
        
        }
	//
        
        // Classeurs
	public ArrayList<Classeur> GetClasseurs(int owner){
            String[] values = {String.valueOf(owner)};
            
        ResultSet set = this.ExecuteQuery("SELECT * FROM Classeur INNER JOIN Utilisateur ON Classeur.idUtilisateur = Utilisateur.idUtilisateur WHERE idUtilisateur = ?;",values);
        
        ArrayList<Classeur> reslist = new ArrayList<Classeur>();
            try {
                while(set.next()){
                    Classeur classeur = new Classeur(set.getInt("idClasseur"),set.getString("libelle"),set.getString("couleur"));
                    reslist.add(classeur);
                }
            } catch (SQLException ex) {
                System.err.println("Couldn't acces results from query");
                return null;
            }
        return reslist;
        }
        
        public int UpdateClasseur(String name, String color,int idClasseur){
        String[] values = {name,color,String.valueOf(idClasseur)};
            
        ResultSet key = this.ExecuteQuery("UPDATE Classeur SET libelle = ?, couleur = ? WHERE idClasseur = ?;",values);
        
        return this.KeyRead(key);
        }
        
        public int PostClasseur(String name,String color,int owner){ //Insere un classeur sur la BDD
        String[] values = {name,color,String.valueOf(owner)};
            
        ResultSet key = this.ExecuteQuery("INSERT INTO Classeur (libelle,couleur,idUtilisateur) VALUES (?,?,?);",values);
        
        return this.KeyRead(key);
        }
        
        public int DeleteClasseur(int id){
        String[] values = {String.valueOf(id)};
            
        ResultSet key = this.ExecuteQuery("DELETE FROM Classeur WHERE idClasseur = ?;",values);
        
        return this.KeyRead(key);
        }
        //
        
       
	//Intercalaires
	public ArrayList<Intercalaire> GetIntercalaires(int classeur ){
            String[] values = {String.valueOf(classeur)};
            
        ResultSet set = this.ExecuteQuery("SELECT * FROM Intercalaire INNER JOIN Classeur ON Classeur.idClasseur = Intercalaire.idClasseur WHERE idClasseur = ?;",values);
        
        ArrayList<Intercalaire> reslist = new ArrayList<Intercalaire>();
            try {
                while(set.next()){
                    Intercalaire intercalaire = new Intercalaire(set.getInt("idIntercalaire"),set.getString("libelle"),set.getString("couleur"));
                    reslist.add(intercalaire);
                }
            } catch (SQLException ex) {
                System.err.println("Couldn't acces results from query");
                return null;
            }
        return reslist;
        }
        
        public int UpdateIntercalaire(String name, String color,int idIntercalaire){
        String[] values = {name,color,String.valueOf(idIntercalaire)};
            
        ResultSet key = this.ExecuteQuery("UPDATE Intercalaire SET libelle = ?, couleur = ? WHERE idIntercalaire = ?;",values);
        
        return this.KeyRead(key);
        }
        
        public int PostIntercalaire(String name,String color,int classeur){ //Insere un intercalaire sur la BDD
        String[] values = {name,color,String.valueOf(classeur)};
            
        ResultSet key = this.ExecuteQuery("INSERT INTO Intercalaire (libelle,couleur,idClasseur) VALUES (?,?,?);",values);
        
        return this.KeyRead(key);
        }
        
        public int DeleteIntercalaire(int id){
        String[] values = {String.valueOf(id)};
            
        ResultSet key = this.ExecuteQuery("DELETE FROM Intercalaire WHERE idIntercalaire = ?;",values);
        
        return this.KeyRead(key);
        }
        //
	
        //Feuilles
	public ArrayList<Feuille> GetFeuilles(int intercalaire){
        String[] values = {String.valueOf(intercalaire)};
            
        ResultSet set = this.ExecuteQuery("SELECT * FROM Feuille INNER JOIN Intercalaire ON Feuille.idIntercalaire = Intercalaire.idIntercalaire WHERE idIntercalaire = ?;",values);
        
        ArrayList<Feuille> reslist = new ArrayList<Feuille>();
            try {
                while(set.next()){
                    Feuille feuille = new Feuille(set.getInt("idFeuille"),set.getString("titre"));
                    reslist.add(feuille);
                }
            } catch (SQLException ex) {
                System.err.println("Couldn't acces results from query");
                return null;
            }
        return reslist;
        }
        
        public ArrayList<Feuille> GetFeuillesByTag(int tag){
        String[] values = {String.valueOf(tag)};
            
        ResultSet set = this.ExecuteQuery("SELECT * FROM Feuille INNER JOIN Qualifie ON Feuille.idFeuille = Qualifie.idFeuille WHERE idLabel = ?;",values);
        
        ArrayList<Feuille> reslist = new ArrayList<Feuille>();
            try {
                while(set.next()){
                    Feuille feuille = new Feuille(set.getInt("idFeuille"),set.getString("titre"));
                    reslist.add(feuille);
                }
            } catch (SQLException ex) {
                System.err.println("Couldn't acces results from query");
                return null;
            }
        return reslist;
        }
        
        public ArrayList<Feuille> GetFeuille(int id){
        String[] values = {String.valueOf(id)};
            
        ResultSet set = this.ExecuteQuery("SELECT * FROM Feuille WHERE idFeuille = ?;",values);
        
        ArrayList<Feuille> reslist = new ArrayList<Feuille>();
            try {
                while(set.next()){
                    Feuille feuille = new Feuille(set.getInt("idFeuille"),set.getString("titre"),set.getString("contenu"));
                    reslist.add(feuille);
                }
            } catch (SQLException ex) {
                System.err.println("Couldn't acces results from query");
                return null;
            }
        return reslist;
        }
        
        public int UpdateFeuille(String titre, String contenu,int idFeuille){
        String[] values = {titre,contenu,String.valueOf(idFeuille)};
            
        ResultSet key = this.ExecuteQuery("UPDATE Feuille SET titre = ?, contenu = ? WHERE idFeuille = ?;",values);
        
        return this.KeyRead(key);
        }
        
        public int PostFeuille(String name,String content,int intercalaire){  //Insere une feuille sur la BDD
        String[] values = {name,content,String.valueOf(intercalaire)};
            
        ResultSet key = this.ExecuteQuery("INSERT INTO Feuille (titre,contenu,idIntercalaire) VALUES (?,?,?);",values);
        
        return this.KeyRead(key);
        }
        
        public int DeleteFeuille(int id){
        String[] values = {String.valueOf(id)};
            
        ResultSet key = this.ExecuteQuery("DELETE FROM Feuille WHERE idFeuille = ?;",values);
        
        return this.KeyRead(key);
        }
        //
        
        //Labels+Feuilles(Table "Qualifie")
        public int RemoveLabel(int label, int feuille){
        String[] values = {String.valueOf(label),String.valueOf(feuille)};
            
        ResultSet key = this.ExecuteQuery("DELETE FROM Qualifie WHERE idLabel = ? AND idFeuille = ?;",values);
        
        return this.KeyRead(key);
        }
        
        public int AddLabel(int label, int feuille){
         String[] values = {String.valueOf(label),String.valueOf(feuille)};
            
        ResultSet key = this.ExecuteQuery("INSERT INTO Qualifie (idLabel,idFeuille) VALUES (?,?);",values);
        
        return this.KeyRead(key);
        }
        //
        
        //Labels
        public ArrayList<Label> GetLabels(){
        String[] values = {};
                
        ResultSet set = this.ExecuteQuery("SELECT * FROM Label",values); 
        
        ArrayList<Label> reslist = new ArrayList<Label>();
            try {
                while(set.next()){
                    Label labe = new Label(set.getInt("idLabel"),set.getString("libelle"));
                    reslist.add(labe);
                }
            } catch (SQLException ex) {
                System.err.println("Couldn't acces results from query");
                return null;
            }
        return reslist;
        }
        
        public ArrayList<Label> GetLabels(int idFeuille){
        String[] values = {String.valueOf(idFeuille)};
                
        ResultSet set = this.ExecuteQuery("SELECT * FROM Label INNER JOIN Qualifie ON Label.idLabel = Qualifie.idLabel WHERE idFeuille = ?",values); 
        
        ArrayList<Label> reslist = new ArrayList<Label>();
            try {
                while(set.next()){
                    Label labe = new Label(set.getInt("idLabel"),set.getString("libelle"));
                    reslist.add(labe);
                }
            } catch (SQLException ex) {
                System.err.println("Couldn't acces results from query");
                return null;
            }
        return reslist;
        }
        
        public int UpdateLabel(String libelle,int idLabel){
        String[] values = {libelle,String.valueOf(idLabel)};
            
        ResultSet key = this.ExecuteQuery("UPDATE Label SET libelle = ? WHERE idLabel = ?;",values);
        
        return this.KeyRead(key);
        }
        
        public int PostLabel(String libelle){  //Insere une feuille sur la BDD
        String[] values = {libelle};
            
        ResultSet key = this.ExecuteQuery("INSERT INTO Label (libelle) VALUES (?,?,?);",values);
        
        return this.KeyRead(key);
        }
        
        public int DeleteLabel(int id){
        String[] values = {String.valueOf(id)};
            
        ResultSet key = this.ExecuteQuery("DELETE FROM Label WHERE idLabel = ?;",values);
        
        return this.KeyRead(key);
        }
        //
	
	protected void finalize(){
		try {
			this.connection.close();
			}
		catch (SQLException e)
			{
			  System.err.println("Couldn't close database. Got error:"); 
			  System.err.println(e.getMessage()); 
			} 
		}
	
	}
