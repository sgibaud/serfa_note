/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sansnom.serfa_note;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.sansnom.serfa_note.Home;

/**
 *
 * @author draconic
 */
public class Application_Background extends javax.swing.JPanel {

    public int idActiveUser;
    private Home home;
    private Nuancier nuancier;
    private Color colors;
    private Home origin;

    /**
     * Creates new form Application_Background
     */
    public Application_Background(Home home) {
        initComponents();
        this.origin = home;
    }

    public void setUser(String user) {
        JtextUser.setText(user);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSelected = new javax.swing.JDialog();
        jDiagPan = new javax.swing.JPanel();
        JLabelPane = new javax.swing.JPanel();
        jLabelColor = new javax.swing.JLabel();
        JpaneColor = new javax.swing.JPanel();
        Jblue = new javax.swing.JButton();
        jGreen = new javax.swing.JButton();
        jPink = new javax.swing.JButton();
        jOrange = new javax.swing.JButton();
        jRed = new javax.swing.JButton();
        jAmbre = new javax.swing.JButton();
        jFog = new javax.swing.JButton();
        jCanari = new javax.swing.JButton();
        jMenthe = new javax.swing.JButton();
        jVioloine = new javax.swing.JButton();
        jChartreuse = new javax.swing.JButton();
        jKing = new javax.swing.JButton();
        jNewNote = new javax.swing.JPanel();
        JTextTitle1 = new javax.swing.JTextField();
        jNewClasseur = new javax.swing.JPanel();
        jSelectedColor = new javax.swing.JButton();
        JTextTitle = new javax.swing.JTextField();
        JRoot = new javax.swing.JPanel();
        Jmenu = new javax.swing.JPanel();
        LlogoLayout = new javax.swing.JPanel();
        Jlogo = new javax.swing.JLabel();
        JlabUser = new javax.swing.JLabel();
        JtextUser = new javax.swing.JTextField();
        JbtnExit = new javax.swing.JButton();
        Jcenterpanel = new javax.swing.JPanel();
        Jtop = new javax.swing.JPanel();
        JbtnSearch = new javax.swing.JButton();
        Jcenter = new javax.swing.JPanel();
        JClasseur = new javax.swing.JPanel();
        JaddClasseur = new javax.swing.JButton();
        JlabelClasseur = new javax.swing.JLabel();
        JClasseurBloc = new javax.swing.JPanel();
        JIntercalaire = new javax.swing.JPanel();
        JaddIntercalaire = new javax.swing.JButton();
        JLabelIntercalaire = new javax.swing.JLabel();
        jIntercalaireBloc = new javax.swing.JPanel();
        Jnote = new javax.swing.JPanel();
        JaddNote = new javax.swing.JButton();
        JlabelNote = new javax.swing.JLabel();
        jNoteBloc = new javax.swing.JPanel();

        JSelected.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        JSelected.setBackground(new java.awt.Color(32, 46, 64));
        JSelected.setEnabled(false);
        JSelected.setLocation(new java.awt.Point(0, 0));
        JSelected.setMinimumSize(new java.awt.Dimension(270, 180));
        JSelected.setModal(true);
        JSelected.setName("ColorPicker"); // NOI18N
        JSelected.setResizable(false);
        JSelected.setSize(540,360);
        JSelected.setType(java.awt.Window.Type.POPUP);

        jDiagPan.setBackground(new java.awt.Color(32, 46, 64));
        jDiagPan.setMaximumSize(new java.awt.Dimension(270, 180));
        jDiagPan.setMinimumSize(new java.awt.Dimension(270, 180));
        jDiagPan.setNextFocusableComponent(jDiagPan);
        jDiagPan.setPreferredSize(new java.awt.Dimension(270, 180));
        jDiagPan.setLayout(new java.awt.BorderLayout());

        JLabelPane.setBackground(new java.awt.Color(32, 46, 64));
        JLabelPane.setMaximumSize(new java.awt.Dimension(270, 30));
        JLabelPane.setMinimumSize(new java.awt.Dimension(270, 30));
        JLabelPane.setPreferredSize(new java.awt.Dimension(270, 30));

        jLabelColor.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        jLabelColor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelColor.setText("Label couleur");

        javax.swing.GroupLayout JLabelPaneLayout = new javax.swing.GroupLayout(JLabelPane);
        JLabelPane.setLayout(JLabelPaneLayout);
        JLabelPaneLayout.setHorizontalGroup(
            JLabelPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JLabelPaneLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabelColor)
                .addGap(69, 69, 69))
        );
        JLabelPaneLayout.setVerticalGroup(
            JLabelPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JLabelPaneLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabelColor))
        );

        jDiagPan.add(JLabelPane, java.awt.BorderLayout.NORTH);

        JpaneColor.setBackground(new java.awt.Color(32, 46, 64));
        JpaneColor.setMaximumSize(new java.awt.Dimension(100, 100));
        JpaneColor.setMinimumSize(new java.awt.Dimension(100, 100));
        JpaneColor.setPreferredSize(new java.awt.Dimension(100, 150));
        JpaneColor.setLayout(new java.awt.GridLayout(3, 4, 8, 8));

        Jblue.setBackground(new java.awt.Color(255, 0, 0));
        Jblue.setAlignmentX(0.5F);
        Jblue.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Jblue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JblueActionPerformed(evt);
            }
        });
        JpaneColor.add(Jblue);

        jGreen.setBackground(new java.awt.Color(0, 255, 0));
        jGreen.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGreenActionPerformed(evt);
            }
        });
        JpaneColor.add(jGreen);

        jPink.setBackground(new java.awt.Color(0, 0, 255));
        jPink.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPinkActionPerformed(evt);
            }
        });
        JpaneColor.add(jPink);

        jOrange.setBackground(new java.awt.Color(203, 34, 229));
        jOrange.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrangeActionPerformed(evt);
            }
        });
        JpaneColor.add(jOrange);

        jRed.setBackground(new java.awt.Color(229, 195, 23));
        jRed.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRedActionPerformed(evt);
            }
        });
        JpaneColor.add(jRed);

        jAmbre.setBackground(new java.awt.Color(255, 122, 82));
        jAmbre.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jAmbre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmbreActionPerformed(evt);
            }
        });
        JpaneColor.add(jAmbre);

        jFog.setBackground(new java.awt.Color(20, 204, 149));
        jFog.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jFog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFogActionPerformed(evt);
            }
        });
        JpaneColor.add(jFog);

        jCanari.setBackground(new java.awt.Color(87, 110, 242));
        jCanari.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCanari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCanariActionPerformed(evt);
            }
        });
        JpaneColor.add(jCanari);

        jMenthe.setBackground(new java.awt.Color(191, 48, 139));
        jMenthe.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jMenthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMentheActionPerformed(evt);
            }
        });
        JpaneColor.add(jMenthe);

        jVioloine.setBackground(new java.awt.Color(191, 201, 201));
        jVioloine.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jVioloine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVioloineActionPerformed(evt);
            }
        });
        JpaneColor.add(jVioloine);

        jChartreuse.setBackground(new java.awt.Color(102, 205, 217));
        jChartreuse.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jChartreuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChartreuseActionPerformed(evt);
            }
        });
        JpaneColor.add(jChartreuse);

        jKing.setBackground(new java.awt.Color(178, 31, 0));
        jKing.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jKing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKingActionPerformed(evt);
            }
        });
        JpaneColor.add(jKing);

        jDiagPan.add(JpaneColor, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout JSelectedLayout = new javax.swing.GroupLayout(JSelected.getContentPane());
        JSelected.getContentPane().setLayout(JSelectedLayout);
        JSelectedLayout.setHorizontalGroup(
            JSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDiagPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        JSelectedLayout.setVerticalGroup(
            JSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDiagPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jNewNote.setBackground(new java.awt.Color(42, 70, 105));
        jNewNote.setMaximumSize(new java.awt.Dimension(235, 40));
        jNewNote.setMinimumSize(new java.awt.Dimension(235, 40));
        jNewNote.setPreferredSize(new java.awt.Dimension(235, 40));

        JTextTitle1.setBackground(new java.awt.Color(42, 70, 105));
        JTextTitle1.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        JTextTitle1.setForeground(new java.awt.Color(255, 255, 255));
        JTextTitle1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTextTitle1.setText("jTextField1");
        JTextTitle1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        JTextTitle1.setMargin(new java.awt.Insets(5, 2, 5, 2));
        JTextTitle1.setMaximumSize(new java.awt.Dimension(220, 30));
        JTextTitle1.setMinimumSize(new java.awt.Dimension(220, 30));
        JTextTitle1.setPreferredSize(new java.awt.Dimension(220, 30));
        jNewNote.add(JTextTitle1);

        jNewClasseur.setBackground(new java.awt.Color(42, 70, 105));
        jNewClasseur.setMaximumSize(new java.awt.Dimension(235, 40));
        jNewClasseur.setMinimumSize(new java.awt.Dimension(235, 40));
        jNewClasseur.setPreferredSize(new java.awt.Dimension(235, 40));

        jSelectedColor.setBackground(new java.awt.Color(255, 0, 0));
        jSelectedColor.setAlignmentY(0.0F);
        jSelectedColor.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jSelectedColor.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jSelectedColor.setMaximumSize(new java.awt.Dimension(15, 30));
        jSelectedColor.setMinimumSize(new java.awt.Dimension(15, 30));
        jSelectedColor.setPreferredSize(new java.awt.Dimension(15, 30));
        jSelectedColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectedColorActionPerformed(evt);
            }
        });
        jNewClasseur.add(jSelectedColor);

        JTextTitle.setBackground(new java.awt.Color(42, 70, 105));
        JTextTitle.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        JTextTitle.setForeground(new java.awt.Color(255, 255, 255));
        JTextTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTextTitle.setText("jTextField1");
        JTextTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        JTextTitle.setMargin(new java.awt.Insets(2, 2, 2, 2));
        JTextTitle.setMaximumSize(new java.awt.Dimension(180, 20));
        JTextTitle.setMinimumSize(new java.awt.Dimension(180, 20));
        JTextTitle.setPreferredSize(new java.awt.Dimension(180, 20));
        jNewClasseur.add(JTextTitle);

        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setLayout(new java.awt.BorderLayout());

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
        JtextUser.setText("N/A");
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
        Jmenu.add(JbtnExit);

        JRoot.add(Jmenu, java.awt.BorderLayout.WEST);

        Jcenterpanel.setLayout(new java.awt.BorderLayout());

        Jtop.setBackground(new java.awt.Color(32, 46, 64));
        Jtop.setPreferredSize(new java.awt.Dimension(980, 100));

        JbtnSearch.setBackground(new Color(255,255,255,0));
        JbtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loupe@2x.png"))); // NOI18N
        JbtnSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loupe_neg@2x.png"))); // NOI18N

        javax.swing.GroupLayout JtopLayout = new javax.swing.GroupLayout(Jtop);
        Jtop.setLayout(JtopLayout);
        JtopLayout.setHorizontalGroup(
            JtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JtopLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JbtnSearch)
                .addGap(911, 911, 911))
        );
        JtopLayout.setVerticalGroup(
            JtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JtopLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JbtnSearch)
                .addGap(14, 14, 14))
        );

        Jcenterpanel.add(Jtop, java.awt.BorderLayout.NORTH);

        Jcenter.setMaximumSize(new java.awt.Dimension(980, 620));
        Jcenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        JClasseur.setBackground(new java.awt.Color(42, 70, 105));
        JClasseur.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(32, 46, 64), 4, true));
        JClasseur.setMaximumSize(new java.awt.Dimension(250, 620));
        JClasseur.setMinimumSize(new java.awt.Dimension(250, 620));
        JClasseur.setPreferredSize(new java.awt.Dimension(265, 620));

        JaddClasseur.setBackground(new Color(255,255,255,0));
        JaddClasseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        JaddClasseur.setAlignmentY(0.0F);
        JaddClasseur.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_neg.png"))); // NOI18N
        JaddClasseur.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_roll.png"))); // NOI18N
        JaddClasseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddClasseurActionPerformed(evt);
            }
        });

        JlabelClasseur.setBackground(new java.awt.Color(255, 255, 255));
        JlabelClasseur.setFont(new java.awt.Font("URW Gothic", 0, 20)); // NOI18N
        JlabelClasseur.setForeground(new java.awt.Color(255, 255, 255));
        JlabelClasseur.setText("nouveau classeur");
        JlabelClasseur.setMaximumSize(new java.awt.Dimension(263, 30));
        JlabelClasseur.setMinimumSize(new java.awt.Dimension(263, 30));
        JlabelClasseur.setPreferredSize(new java.awt.Dimension(330, 25));

        JClasseurBloc.setBackground(new java.awt.Color(42, 70, 105));
        JClasseurBloc.setAutoscrolls(true);
        JClasseurBloc.setMaximumSize(new java.awt.Dimension(195, 540));
        JClasseurBloc.setMinimumSize(new java.awt.Dimension(195, 540));
        JClasseurBloc.setPreferredSize(new java.awt.Dimension(195, 540));
        JClasseurBloc.setLayout(new java.awt.GridLayout(10, 1));

        javax.swing.GroupLayout JClasseurLayout = new javax.swing.GroupLayout(JClasseur);
        JClasseur.setLayout(JClasseurLayout);
        JClasseurLayout.setHorizontalGroup(
            JClasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JClasseurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JClasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JClasseurBloc, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JClasseurLayout.createSequentialGroup()
                        .addComponent(JaddClasseur)
                        .addGap(5, 5, 5)
                        .addComponent(JlabelClasseur, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        JClasseurLayout.setVerticalGroup(
            JClasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JClasseurLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JClasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JlabelClasseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JaddClasseur))
                .addGap(18, 18, 18)
                .addComponent(JClasseurBloc, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );

        Jcenter.add(JClasseur);

        JIntercalaire.setBackground(new java.awt.Color(42, 70, 105));
        JIntercalaire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 46, 64), 4));
        JIntercalaire.setMaximumSize(new java.awt.Dimension(300, 620));
        JIntercalaire.setMinimumSize(new java.awt.Dimension(300, 620));
        JIntercalaire.setPreferredSize(new java.awt.Dimension(315, 620));

        JaddIntercalaire.setBackground(new Color(255,255,255,0));
        JaddIntercalaire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        JaddIntercalaire.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_neg.png"))); // NOI18N
        JaddIntercalaire.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_roll.png"))); // NOI18N
        JaddIntercalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddIntercalaireActionPerformed(evt);
            }
        });

        JLabelIntercalaire.setFont(new java.awt.Font("URW Gothic", 0, 20)); // NOI18N
        JLabelIntercalaire.setForeground(new java.awt.Color(255, 255, 255));
        JLabelIntercalaire.setText("nouvelle intercalaire");
        JLabelIntercalaire.setMaximumSize(new java.awt.Dimension(263, 30));
        JLabelIntercalaire.setMinimumSize(new java.awt.Dimension(263, 30));
        JLabelIntercalaire.setPreferredSize(new java.awt.Dimension(263, 25));

        jIntercalaireBloc.setBackground(new java.awt.Color(42, 70, 105));
        jIntercalaireBloc.setAutoscrolls(true);
        jIntercalaireBloc.setMaximumSize(new java.awt.Dimension(195, 540));
        jIntercalaireBloc.setMinimumSize(new java.awt.Dimension(195, 540));
        jIntercalaireBloc.setPreferredSize(new java.awt.Dimension(195, 540));
        jIntercalaireBloc.setLayout(new java.awt.GridLayout(10, 1));

        javax.swing.GroupLayout JIntercalaireLayout = new javax.swing.GroupLayout(JIntercalaire);
        JIntercalaire.setLayout(JIntercalaireLayout);
        JIntercalaireLayout.setHorizontalGroup(
            JIntercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIntercalaireLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JIntercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jIntercalaireBloc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JIntercalaireLayout.createSequentialGroup()
                        .addComponent(JaddIntercalaire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabelIntercalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        JIntercalaireLayout.setVerticalGroup(
            JIntercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIntercalaireLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JIntercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JaddIntercalaire)
                    .addComponent(JLabelIntercalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jIntercalaireBloc, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );

        Jcenter.add(JIntercalaire);

        Jnote.setBackground(new java.awt.Color(42, 70, 105));
        Jnote.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(32, 46, 64), 4, true));
        Jnote.setMaximumSize(new java.awt.Dimension(430, 620));
        Jnote.setMinimumSize(new java.awt.Dimension(430, 620));
        Jnote.setPreferredSize(new java.awt.Dimension(400, 620));

        JaddNote.setBackground(new Color(255,255,255,0));
        JaddNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        JaddNote.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_neg.png"))); // NOI18N
        JaddNote.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_roll.png"))); // NOI18N
        JaddNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddNoteActionPerformed(evt);
            }
        });

        JlabelNote.setFont(new java.awt.Font("URW Gothic", 0, 20)); // NOI18N
        JlabelNote.setForeground(new java.awt.Color(255, 255, 255));
        JlabelNote.setText("nouvelle note");

        jNoteBloc.setBackground(new java.awt.Color(42, 70, 105));
        jNoteBloc.setAutoscrolls(true);
        jNoteBloc.setMaximumSize(new java.awt.Dimension(195, 540));
        jNoteBloc.setMinimumSize(new java.awt.Dimension(195, 540));
        jNoteBloc.setPreferredSize(new java.awt.Dimension(195, 540));
        jNoteBloc.setLayout(new java.awt.GridLayout(10, 1));

        javax.swing.GroupLayout JnoteLayout = new javax.swing.GroupLayout(Jnote);
        Jnote.setLayout(JnoteLayout);
        JnoteLayout.setHorizontalGroup(
            JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JnoteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JnoteLayout.createSequentialGroup()
                        .addComponent(jNoteBloc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(JnoteLayout.createSequentialGroup()
                        .addComponent(JaddNote)
                        .addGap(5, 5, 5)
                        .addComponent(JlabelNote)
                        .addGap(20, 20, 20))))
        );
        JnoteLayout.setVerticalGroup(
            JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JnoteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JlabelNote)
                    .addComponent(JaddNote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNoteBloc, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );

        Jcenter.add(Jnote);

        Jcenterpanel.add(Jcenter, java.awt.BorderLayout.SOUTH);

        JRoot.add(Jcenterpanel, java.awt.BorderLayout.CENTER);

        add(JRoot, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    private void JbtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbtnExitMouseClicked
        // TODO add your handling code here:
        home.logout();
    }//GEN-LAST:event_JbtnExitMouseClicked

    private void jGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGreenActionPerformed
        // TODO add your handling code here: jSelectedColor.setBackground(new Color(51,51,255));
        jSelectedColor.setBackground(new Color(0, 255, 0));
    }//GEN-LAST:event_jGreenActionPerformed

    private void JblueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JblueActionPerformed
        // TODO add your handling code here:
        // colors = nuancier.colors[0];
        jSelectedColor.setBackground(new Color(0, 0, 255));
    }//GEN-LAST:event_JblueActionPerformed

    private void jPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPinkActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(255, 0, 204));
    }//GEN-LAST:event_jPinkActionPerformed

    private void jOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrangeActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(255, 153, 51));
    }//GEN-LAST:event_jOrangeActionPerformed

    private void jRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRedActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_jRedActionPerformed

    private void jAmbreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmbreActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(240, 195, 0));
    }//GEN-LAST:event_jAmbreActionPerformed

    private void jFogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFogActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(187, 210, 225));
    }//GEN-LAST:event_jFogActionPerformed

    private void jCanariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCanariActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(231, 240, 13));
    }//GEN-LAST:event_jCanariActionPerformed

    private void jMentheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMentheActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(84, 249, 141));
    }//GEN-LAST:event_jMentheActionPerformed

    private void jVioloineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVioloineActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(161, 6, 132));
    }//GEN-LAST:event_jVioloineActionPerformed

    private void jChartreuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChartreuseActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(194, 247, 50));
    }//GEN-LAST:event_jChartreuseActionPerformed

    private void jKingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKingActionPerformed
        // TODO add your handling code here:
        jSelectedColor.setBackground(new Color(49, 140, 231));
    }//GEN-LAST:event_jKingActionPerformed


    private void JaddClasseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddClasseurActionPerformed
        // TODO add your handling code here:
        JPanel panelBloc = new JPanel();
        //panelBloc.setLayout(new BoxLayout(panelBloc, BoxLayout.Y_AXIS));
        panelBloc.setBackground(new java.awt.Color(42, 70, 105));
        panelBloc.add(jNewClasseur);
        JClasseurBloc.add(panelBloc);
        panelBloc.revalidate();
        panelBloc.repaint();
        //System.out.println(jNewClasseur);
    }//GEN-LAST:event_JaddClasseurActionPerformed

    private void JaddNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddNoteActionPerformed
        // TODO add your handling code here:
        origin.editor(1);
    }//GEN-LAST:event_JaddNoteActionPerformed

    private void JaddIntercalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddIntercalaireActionPerformed
        // TODO add your handling code here:
        JPanel panelBloc = new JPanel();
        //panelBloc.setLayout(new BoxLayout(panelBloc, BoxLayout.Y_AXIS));
        panelBloc.setBackground(new java.awt.Color(42, 70, 105));
        panelBloc.add(jNewClasseur);
        jIntercalaireBloc.add(panelBloc);
        panelBloc.revalidate();
        panelBloc.repaint();
        //System.out.println(jNewClasseur);
    }//GEN-LAST:event_JaddIntercalaireActionPerformed

    private void jSelectedColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectedColorActionPerformed
        // TODO add your handling code here:
        dialog();
    }//GEN-LAST:event_jSelectedColorActionPerformed


    public void dialog() {
        JSelected = new JDialog(home, "Select Color", true);
        JSelected.getContentPane().add(jDiagPan);
        JSelected.pack();
        JSelected.setLocation(270, 180);
        JSelected.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JClasseur;
    private javax.swing.JPanel JClasseurBloc;
    private javax.swing.JPanel JIntercalaire;
    private javax.swing.JLabel JLabelIntercalaire;
    private javax.swing.JPanel JLabelPane;
    private javax.swing.JPanel JRoot;
    private javax.swing.JDialog JSelected;
    private javax.swing.JTextField JTextTitle;
    private javax.swing.JTextField JTextTitle1;
    private javax.swing.JButton JaddClasseur;
    private javax.swing.JButton JaddIntercalaire;
    private javax.swing.JButton JaddNote;
    private javax.swing.JButton Jblue;
    private javax.swing.JButton JbtnExit;
    private javax.swing.JButton JbtnSearch;
    private javax.swing.JPanel Jcenter;
    private javax.swing.JPanel Jcenterpanel;
    private javax.swing.JLabel JlabUser;
    private javax.swing.JLabel JlabelClasseur;
    private javax.swing.JLabel JlabelNote;
    private javax.swing.JLabel Jlogo;
    private javax.swing.JPanel Jmenu;
    private javax.swing.JPanel Jnote;
    private javax.swing.JPanel JpaneColor;
    private javax.swing.JTextField JtextUser;
    private javax.swing.JPanel Jtop;
    private javax.swing.JPanel LlogoLayout;
    private javax.swing.JButton jAmbre;
    private javax.swing.JButton jCanari;
    private javax.swing.JButton jChartreuse;
    private javax.swing.JPanel jDiagPan;
    private javax.swing.JButton jFog;
    private javax.swing.JButton jGreen;
    private javax.swing.JPanel jIntercalaireBloc;
    private javax.swing.JButton jKing;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JButton jMenthe;
    private javax.swing.JPanel jNewClasseur;
    private javax.swing.JPanel jNewNote;
    private javax.swing.JPanel jNoteBloc;
    private javax.swing.JButton jOrange;
    private javax.swing.JButton jPink;
    private javax.swing.JButton jRed;
    private javax.swing.JButton jSelectedColor;
    private javax.swing.JButton jVioloine;
    // End of variables declaration//GEN-END:variables

}
