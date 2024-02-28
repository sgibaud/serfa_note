/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sansnom.serfa_note;

/**
 *
 * @author draconic
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        JlabelLogin = new javax.swing.JLabel();
        jUserNameL = new javax.swing.JLabel();
        JuserNameInput = new javax.swing.JTextField();
        jPasswordL = new javax.swing.JLabel();
        Jlogin = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 46, 64));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jPanel1.setBackground(new java.awt.Color(155, 181, 191));
        jPanel1.setMaximumSize(new java.awt.Dimension(540, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 360));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 360));

        JlabelLogin.setFont(new java.awt.Font("URW Gothic", 0, 36)); // NOI18N
        JlabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelLogin.setText("Login");
        JlabelLogin.setPreferredSize(new java.awt.Dimension(130, 60));

        jUserNameL.setFont(new java.awt.Font("URW Gothic", 1, 11)); // NOI18N
        jUserNameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUserNameL.setText("user name");
        jUserNameL.setPreferredSize(new java.awt.Dimension(57, 10));

        JuserNameInput.setFont(new java.awt.Font("URW Gothic", 0, 9)); // NOI18N
        JuserNameInput.setMaximumSize(new java.awt.Dimension(200, 36));
        JuserNameInput.setMinimumSize(new java.awt.Dimension(200, 36));
        JuserNameInput.setPreferredSize(new java.awt.Dimension(200, 36));

        jPasswordL.setFont(new java.awt.Font("URW Gothic", 1, 11)); // NOI18N
        jPasswordL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPasswordL.setText("password");
        jPasswordL.setPreferredSize(new java.awt.Dimension(51, 10));

        Jlogin.setForeground(new java.awt.Color(23, 106, 115));
        Jlogin.setText("Login");
        Jlogin.setMaximumSize(new java.awt.Dimension(300, 23));
        Jlogin.setMinimumSize(new java.awt.Dimension(250, 23));
        Jlogin.setPreferredSize(new java.awt.Dimension(300, 23));

        jTextField2.setFont(new java.awt.Font("URW Gothic", 0, 10)); // NOI18N
        jTextField2.setText("Pas encore inscrit ?");
        jTextField2.setMaximumSize(new java.awt.Dimension(110, 19));
        jTextField2.setMinimumSize(new java.awt.Dimension(110, 19));
        jTextField2.setPreferredSize(new java.awt.Dimension(110, 19));

        jPasswordField.setMaximumSize(new java.awt.Dimension(200, 36));
        jPasswordField.setMinimumSize(new java.awt.Dimension(200, 36));
        jPasswordField.setPreferredSize(new java.awt.Dimension(200, 36));

        jButton1.setFont(new java.awt.Font("URW Gothic", 1, 8)); // NOI18N
        jButton1.setText("inscription");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jUserNameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JuserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JlabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(160, 160, 160))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JuserNameInput, jPasswordL, jUserNameL});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(JlabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jUserNameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JuserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelLogin;
    private javax.swing.JButton Jlogin;
    private javax.swing.JTextField JuserNameInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jPasswordL;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jUserNameL;
    // End of variables declaration//GEN-END:variables
}
