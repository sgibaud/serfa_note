/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sansnom.serfa_note;
import java.awt.event.*;

/**
 *
 * @author draconic
 */
public class Inscription extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Inscription() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JcardLogin = new javax.swing.JPanel();
        JlabelLogin = new javax.swing.JLabel();
        jUserNameL = new javax.swing.JLabel();
        JuserNameInput = new javax.swing.JTextField();
        jPasswordL = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        JInscrire = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 46, 64));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1080, 720));

        JcardLogin.setBackground(new java.awt.Color(42, 70, 105));
        JcardLogin.setMaximumSize(new java.awt.Dimension(540, 360));
        JcardLogin.setMinimumSize(new java.awt.Dimension(540, 360));
        JcardLogin.setPreferredSize(new java.awt.Dimension(540, 360));

        JlabelLogin.setFont(new java.awt.Font("URW Gothic", 0, 36)); // NOI18N
        JlabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        JlabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelLogin.setText("Inscription");
        JlabelLogin.setPreferredSize(new java.awt.Dimension(130, 60));

        jUserNameL.setFont(new java.awt.Font("URW Gothic", 1, 11)); // NOI18N
        jUserNameL.setForeground(new java.awt.Color(255, 255, 255));
        jUserNameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUserNameL.setText("user name");
        jUserNameL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jUserNameL.setPreferredSize(new java.awt.Dimension(57, 10));

        JuserNameInput.setBackground(new java.awt.Color(32, 46, 64));
        JuserNameInput.setFont(new java.awt.Font("URW Gothic", 0, 9)); // NOI18N
        JuserNameInput.setForeground(new java.awt.Color(255, 255, 255));
        JuserNameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        JuserNameInput.setMaximumSize(new java.awt.Dimension(200, 36));
        JuserNameInput.setMinimumSize(new java.awt.Dimension(200, 36));
        JuserNameInput.setPreferredSize(new java.awt.Dimension(200, 30));

        jPasswordL.setFont(new java.awt.Font("URW Gothic", 1, 11)); // NOI18N
        jPasswordL.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPasswordL.setText("password");
        jPasswordL.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPasswordL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPasswordL.setPreferredSize(new java.awt.Dimension(51, 10));

        jPasswordField.setBackground(new java.awt.Color(32, 46, 64));
        jPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPasswordField.setMaximumSize(new java.awt.Dimension(200, 36));
        jPasswordField.setMinimumSize(new java.awt.Dimension(200, 36));
        jPasswordField.setPreferredSize(new java.awt.Dimension(200, 30));

        JInscrire.setBackground(new java.awt.Color(32, 46, 64));
        JInscrire.setForeground(new java.awt.Color(255, 255, 255));
        JInscrire.setText("Inscription");
        JInscrire.setBorder(null);
        JInscrire.setMaximumSize(new java.awt.Dimension(75, 23));
        JInscrire.setMinimumSize(new java.awt.Dimension(75, 23));
        JInscrire.setPreferredSize(new java.awt.Dimension(75, 23));
        JInscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JInscrireActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JcardLoginLayout = new javax.swing.GroupLayout(JcardLogin);
        JcardLogin.setLayout(JcardLoginLayout);
        JcardLoginLayout.setHorizontalGroup(
            JcardLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JcardLoginLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(JcardLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(JInscrire, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JuserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUserNameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170))
        );

        JcardLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JuserNameInput, jPasswordL, jUserNameL});

        JcardLoginLayout.setVerticalGroup(
            JcardLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JcardLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JlabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jUserNameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JuserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JInscrire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo@4x.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(JcardLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(JcardLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JInscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JInscrireActionPerformed
        // TODO add your handling code here:
        Home homeInscription = new Home();
        homeInscription.inscription(JuserNameInput.getText(),jPasswordField.getText());
        homeInscription.login(JuserNameInput.getText(),jPasswordField.getText());  
    }//GEN-LAST:event_JInscrireActionPerformed
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JInscrire;
    private javax.swing.JPanel JcardLogin;
    private javax.swing.JLabel JlabelLogin;
    private javax.swing.JTextField JuserNameInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jPasswordL;
    private javax.swing.JLabel jUserNameL;
    // End of variables declaration//GEN-END:variables
}
