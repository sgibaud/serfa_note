/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note.Data;

/**
 *
 * @author DevInfo
 */
public class Feuille {
    private int id;
    private String titre;
    private String text;
    
    public Feuille(int id,String titre){
        this.id= id;
        this.titre = titre;
    }
    public Feuille(int id,String titre, String text){
        this.id= id;
        this.titre = titre;
        this.text = text;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getTitre(){
        return this.titre;
    }
    
    public String getTexte(){
        return this.text;
    }
}
