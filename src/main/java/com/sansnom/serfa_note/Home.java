/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sansnom.serfa_note;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author draconic
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        JButton [] btns = {JbtnExit};
        for (JButton btn : btns) {
            btn.setForeground(new Color(21,25,28));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                   // btn.setBackground(new Color(54,81,207));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                     // btn.setBackground(new Color(21,25,28));
                }
            });
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JRoot = new javax.swing.JPanel();
        Jmenu = new javax.swing.JPanel();
        LlogoLayout = new javax.swing.JPanel();
        Jlogo = new javax.swing.JLabel();
        JlabUser = new javax.swing.JLabel();
        JtextUser = new javax.swing.JTextField();
        JbtnExit = new javax.swing.JButton();
        JbtnUser = new javax.swing.JButton();
        Jcenterpanel = new javax.swing.JPanel();
        Jtop = new javax.swing.JPanel();
        JbtnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Jcenter = new javax.swing.JPanel();
        Jclasseur = new javax.swing.JPanel();
        JaddClasseur = new javax.swing.JButton();
        JlabelClasseur = new javax.swing.JLabel();
        Jintercalaire = new javax.swing.JPanel();
        JaddIntercalaire = new javax.swing.JButton();
        JLabelIntercalaire = new javax.swing.JLabel();
        Jnote = new javax.swing.JPanel();
        JaddNote = new javax.swing.JButton();
        JlabelNote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 240, 235));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(540, 360));
        setName("Jback"); // NOI18N

        JRoot.setLayout(new java.awt.BorderLayout());

        Jmenu.setBackground(new java.awt.Color(23, 106, 115));
        Jmenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(32, 46, 64), 5, true));
        Jmenu.setMaximumSize(new java.awt.Dimension(100, 720));
        Jmenu.setMinimumSize(new java.awt.Dimension(100, 720));
        Jmenu.setPreferredSize(new java.awt.Dimension(100, 720));
        Jmenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 40));

        LlogoLayout.setBackground(new java.awt.Color(23, 106, 115));
        LlogoLayout.setPreferredSize(new java.awt.Dimension(80, 200));

        Jlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo@4x.png"))); // NOI18N
        Jlogo.setPreferredSize(new java.awt.Dimension(84, 84));

        JlabUser.setFont(new java.awt.Font("URW Gothic", 0, 14)); // NOI18N
        JlabUser.setForeground(new java.awt.Color(255, 255, 255));
        JlabUser.setText("Utilisateur :");

        JtextUser.setEditable(false);
        JtextUser.setBackground(new java.awt.Color(23, 106, 115));
        JtextUser.setFont(new java.awt.Font("URW Gothic", 1, 14)); // NOI18N
        JtextUser.setForeground(new java.awt.Color(255, 255, 255));
        JtextUser.setText("Sandrine");
        JtextUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        javax.swing.GroupLayout LlogoLayoutLayout = new javax.swing.GroupLayout(LlogoLayout);
        LlogoLayout.setLayout(LlogoLayoutLayout);
        LlogoLayoutLayout.setHorizontalGroup(
            LlogoLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LlogoLayoutLayout.createSequentialGroup()
                .addComponent(Jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(LlogoLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlabUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LlogoLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LlogoLayoutLayout.createSequentialGroup()
                    .addGap(1, 10, Short.MAX_VALUE)
                    .addComponent(JtextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
        LlogoLayoutLayout.setVerticalGroup(
            LlogoLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LlogoLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(JlabUser)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(LlogoLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LlogoLayoutLayout.createSequentialGroup()
                    .addGap(0, 150, Short.MAX_VALUE)
                    .addComponent(JtextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 32, Short.MAX_VALUE)))
        );

        Jmenu.add(LlogoLayout);

        JbtnExit.setBackground(new Color(255,255,255,0));
        JbtnExit.setForeground(new java.awt.Color(60, 60, 60));
        JbtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit@4x.png"))); // NOI18N
        JbtnExit.setPreferredSize(new java.awt.Dimension(80, 80));
        JbtnExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit_roll@4x.png"))); // NOI18N
        JbtnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit_neg@4x.png"))); // NOI18N
        JbtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbtnExitMouseClicked(evt);
            }
        });
        JbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnExitActionPerformed(evt);
            }
        });
        Jmenu.add(JbtnExit);

        JbtnUser.setBackground(new Color(255,255,255,0));
        JbtnUser.setForeground(new java.awt.Color(60, 60, 60));
        JbtnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/people@4x.png"))); // NOI18N
        JbtnUser.setPreferredSize(new java.awt.Dimension(80, 80));
        JbtnUser.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/people_roll@4x.png"))); // NOI18N
        JbtnUser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/people_neg_1@4x.png"))); // NOI18N
        JbtnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbtnUserMouseClicked(evt);
            }
        });
        JbtnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnUserActionPerformed(evt);
            }
        });
        Jmenu.add(JbtnUser);

        JRoot.add(Jmenu, java.awt.BorderLayout.WEST);

        Jcenterpanel.setPreferredSize(new java.awt.Dimension(980, 720));
        Jcenterpanel.setLayout(new java.awt.BorderLayout());

        Jtop.setBackground(new java.awt.Color(32, 46, 64));
        Jtop.setPreferredSize(new java.awt.Dimension(980, 100));

        JbtnSearch.setBackground(new Color(255,255,255,0));
        JbtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loupe@2x.png"))); // NOI18N
        JbtnSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loupe_neg@2x.png"))); // NOI18N

        jButton1.setText("Editeur de texte");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JtopLayout = new javax.swing.GroupLayout(Jtop);
        Jtop.setLayout(JtopLayout);
        JtopLayout.setHorizontalGroup(
            JtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JtopLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JbtnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(401, 401, 401))
        );
        JtopLayout.setVerticalGroup(
            JtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JtopLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JbtnSearch)
                .addGap(14, 14, 14))
            .addGroup(JtopLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap())
        );

        Jcenterpanel.add(Jtop, java.awt.BorderLayout.NORTH);

        Jcenter.setMaximumSize(new java.awt.Dimension(980, 620));
        Jcenter.setPreferredSize(new java.awt.Dimension(980, 620));
        Jcenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        Jclasseur.setBackground(new java.awt.Color(42, 70, 105));
        Jclasseur.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(32, 46, 64), 4, true));
        Jclasseur.setMaximumSize(new java.awt.Dimension(250, 620));
        Jclasseur.setMinimumSize(new java.awt.Dimension(250, 620));
        Jclasseur.setPreferredSize(new java.awt.Dimension(265, 620));

        JaddClasseur.setBackground(new Color(255,255,255,0));
        JaddClasseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        JaddClasseur.setAlignmentY(0.0F);
        JaddClasseur.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_neg.png"))); // NOI18N
        JaddClasseur.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_roll.png"))); // NOI18N

        JlabelClasseur.setBackground(new java.awt.Color(255, 255, 255));
        JlabelClasseur.setFont(new java.awt.Font("URW Gothic", 0, 20)); // NOI18N
        JlabelClasseur.setForeground(new java.awt.Color(255, 255, 255));
        JlabelClasseur.setText("nouveau classeur");
        JlabelClasseur.setMaximumSize(new java.awt.Dimension(263, 30));
        JlabelClasseur.setMinimumSize(new java.awt.Dimension(263, 30));
        JlabelClasseur.setPreferredSize(new java.awt.Dimension(330, 25));

        javax.swing.GroupLayout JclasseurLayout = new javax.swing.GroupLayout(Jclasseur);
        Jclasseur.setLayout(JclasseurLayout);
        JclasseurLayout.setHorizontalGroup(
            JclasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JclasseurLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JaddClasseur)
                .addGap(5, 5, 5)
                .addComponent(JlabelClasseur, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        JclasseurLayout.setVerticalGroup(
            JclasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JclasseurLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JclasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JlabelClasseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JaddClasseur))
                .addGap(574, 574, 574))
        );

        Jcenter.add(Jclasseur);

        Jintercalaire.setBackground(new java.awt.Color(42, 70, 105));
        Jintercalaire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 46, 64), 4));
        Jintercalaire.setMaximumSize(new java.awt.Dimension(300, 620));
        Jintercalaire.setMinimumSize(new java.awt.Dimension(300, 620));
        Jintercalaire.setPreferredSize(new java.awt.Dimension(315, 620));

        JaddIntercalaire.setBackground(new Color(255,255,255,0));
        JaddIntercalaire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        JaddIntercalaire.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_neg.png"))); // NOI18N
        JaddIntercalaire.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_roll.png"))); // NOI18N

        JLabelIntercalaire.setFont(new java.awt.Font("URW Gothic", 0, 20)); // NOI18N
        JLabelIntercalaire.setForeground(new java.awt.Color(255, 255, 255));
        JLabelIntercalaire.setText("nouvelle intercalaire");
        JLabelIntercalaire.setMaximumSize(new java.awt.Dimension(263, 30));
        JLabelIntercalaire.setMinimumSize(new java.awt.Dimension(263, 30));
        JLabelIntercalaire.setPreferredSize(new java.awt.Dimension(263, 25));

        javax.swing.GroupLayout JintercalaireLayout = new javax.swing.GroupLayout(Jintercalaire);
        Jintercalaire.setLayout(JintercalaireLayout);
        JintercalaireLayout.setHorizontalGroup(
            JintercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JintercalaireLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JaddIntercalaire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelIntercalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JintercalaireLayout.setVerticalGroup(
            JintercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JintercalaireLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JintercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JaddIntercalaire)
                    .addComponent(JLabelIntercalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(574, 574, 574))
        );

        Jcenter.add(Jintercalaire);

        Jnote.setBackground(new java.awt.Color(42, 70, 105));
        Jnote.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(32, 46, 64), 4, true));
        Jnote.setMaximumSize(new java.awt.Dimension(430, 620));
        Jnote.setMinimumSize(new java.awt.Dimension(430, 620));
        Jnote.setPreferredSize(new java.awt.Dimension(400, 620));

        JaddNote.setBackground(new Color(255,255,255,0));
        JaddNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        JaddNote.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_neg.png"))); // NOI18N
        JaddNote.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_roll.png"))); // NOI18N

        JlabelNote.setFont(new java.awt.Font("URW Gothic", 0, 20)); // NOI18N
        JlabelNote.setForeground(new java.awt.Color(255, 255, 255));
        JlabelNote.setText("nouvelle note");

        javax.swing.GroupLayout JnoteLayout = new javax.swing.GroupLayout(Jnote);
        Jnote.setLayout(JnoteLayout);
        JnoteLayout.setHorizontalGroup(
            JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JnoteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JaddNote)
                .addGap(5, 5, 5)
                .addComponent(JlabelNote)
                .addGap(20, 20, 20))
        );
        JnoteLayout.setVerticalGroup(
            JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JnoteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JlabelNote)
                    .addComponent(JaddNote))
                .addGap(574, 574, 574))
        );

        Jcenter.add(Jnote);

        Jcenterpanel.add(Jcenter, java.awt.BorderLayout.SOUTH);

        JRoot.add(Jcenterpanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(JRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbtnExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnExitMouseClicked

    private void JbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnExitActionPerformed

    private void JbtnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbtnUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnUserMouseClicked

    private void JbtnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        /*SwingUtilities.invokeLater(() -> {
                        new EditorPane().setVisible(true);
                        });    */
        EditorPane textEditor = new EditorPane();
        Jcenterpanel.add(textEditor);
        textEditor.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelIntercalaire;
    private javax.swing.JPanel JRoot;
    private javax.swing.JButton JaddClasseur;
    private javax.swing.JButton JaddIntercalaire;
    private javax.swing.JButton JaddNote;
    private javax.swing.JButton JbtnExit;
    private javax.swing.JButton JbtnSearch;
    private javax.swing.JButton JbtnUser;
    private javax.swing.JPanel Jcenter;
    private javax.swing.JPanel Jcenterpanel;
    private javax.swing.JPanel Jclasseur;
    private javax.swing.JPanel Jintercalaire;
    private javax.swing.JLabel JlabUser;
    private javax.swing.JLabel JlabelClasseur;
    private javax.swing.JLabel JlabelNote;
    private javax.swing.JLabel Jlogo;
    private javax.swing.JPanel Jmenu;
    private javax.swing.JPanel Jnote;
    private javax.swing.JTextField JtextUser;
    private javax.swing.JPanel Jtop;
    private javax.swing.JPanel LlogoLayout;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
