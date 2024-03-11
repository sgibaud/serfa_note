/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sansnom.serfa_note;

import com.sansnom.serfa_note.Data.BDDO;
import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

// import composant

/**
 *
 * @author draconic
 */
public class Home extends javax.swing.JFrame {

    private static Home app;
    private Login login;
    private Application_Background home;
<<<<<<< HEAD
    private Inscription inscription;
    private BDDO db;
=======
    private EditorPane editor;
>>>>>>> psylook
    /**
     * Creates new form Home
     */
    public Home() {
        db = new BDDO();
        initComponents();
        login = new Login(this);
        inscription = new Inscription();
        home = new Application_Background();
<<<<<<< HEAD
        home.setUser("vuh");
=======
        editor = new EditorPane();
>>>>>>> psylook
        setContentPane(login);
    }
    
    /*public static void showForm(Component component) {
        component.applyComponentOrientation(app.getComponentOrientation());
        // app.home.showForm(component);
    }*/
<<<<<<< HEAD
    
    public void login(String id,String pswd) {
        int valid = db.ConnectUser(id,pswd);
        if (valid != -1){
            home.setUser(id);
            home.idActiveUser = valid;
            // FlatAnimatedLafChange.showSnapshot();
            app.setContentPane(app.home);
            app.home.applyComponentOrientation(app.getComponentOrientation());
            // setSelectedMenu(0, 0);
            //app.home.hideMenu();
            SwingUtilities.updateComponentTreeUI(app.home);
            //FlatAnimatedLafChange.hideSnapshotWithAnimation();
            }
        else {}
    }
   
    
       // insertion d'un nouveau compte
    public void inscription(String id, String pswd) {
       db.InsertUser(id, pswd);
    }
   
   // connecte page inscription
    public void InscriptionTo () {
        app.setContentPane(app.inscription);
        app.inscription.applyComponentOrientation(app.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(app.inscription);
    }
=======
>>>>>>> psylook
    
    
    public static void logout() {
        app.setContentPane(app.login);
        app.login.applyComponentOrientation(app.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(app.login);
    }
<<<<<<< HEAD
   
=======
    
    public static void editor() {
        // FlatAnimatedLafChange.showSnapshot();
        app.setContentPane(app.editor);
        //app.editor.applyComponentOrientation(app.getComponentOrientation());
        // setSelectedMenu(0, 0);
        //app.home.hideMenu();
        SwingUtilities.updateComponentTreeUI(app.editor);
        //FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
>>>>>>> psylook

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloc Note");
        setBackground(new java.awt.Color(242, 240, 235));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(540, 360));
        setName("Jback"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
            // TODO add your handling code here:
            dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                app = new Home();
                app.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
