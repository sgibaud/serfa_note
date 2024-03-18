/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sansnom.serfa_note;

import com.sansnom.serfa_note.Data.Label;
import com.sansnom.serfa_note.Data.Feuille;

import com.sansnom.serfa_note.Data.Classeur;
import com.sansnom.serfa_note.Data.Feuille;
import com.sansnom.serfa_note.Data.Intercalaire;
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
import java.util.ArrayList;

/**
 *
 * @author draconic
 */
public class Application_Background extends javax.swing.JPanel {

    public int idActiveUser;
    public int idActiveClasseur;
    public int idActiveIntercalaire;
    private Home home;
    private Nuancier nuancier;
    private Color colors;
    private Home origin;
    private LabelClass labels;
    
    private ArrayList<Label> listLabels;

    private Color SelectedColorBtn;

    /**
     * Creates new form Application_Background
     */
    public Application_Background(Home home) {
        initComponents();
        this.origin = home;
        this.fillBox(origin.db.GetLabels());
    }

    public void setUser(int id, String user) {
        idActiveUser = id;
        JtextUser.setText(user);
        loadClasseur();
    }

    public void setClasseur(int id) {
        this.idActiveClasseur = id;
        loadIntercalaire();
    }

    public void setIntercalaire(int id) {
        this.idActiveIntercalaire = id;
        loadFeuille();
    }

    private void loadClasseur() {
        cleartables(2);
        ArrayList<Classeur> clist = this.origin.db.GetClasseurs(this.idActiveUser);
        Classeur newcla;
        for (int i = 0; i < clist.size(); i++) {
            newcla = clist.get(i);
            addClasseur(newcla);
        }
        JClasseurBloc.revalidate();
        JClasseurBloc.repaint();
        jIntercalaireBloc.revalidate();
        jIntercalaireBloc.repaint();
        jNoteBloc.revalidate();
        jNoteBloc.repaint();
    }

    private void loadIntercalaire() {
        cleartables(1);
        ArrayList<Intercalaire> ilist = this.origin.db.GetIntercalaires(this.idActiveClasseur);
        Intercalaire newIn;
        for (int i = 0; i < ilist.size(); i++) {
            newIn = ilist.get(i);
            addIntercalaire(newIn);
        }
        jIntercalaireBloc.revalidate();
        jIntercalaireBloc.repaint();
        jNoteBloc.revalidate();
        jNoteBloc.repaint();
    }

    private void loadFeuille() {
        cleartables(0);
        ArrayList<Feuille> flist = this.origin.db.GetFeuilles(this.idActiveIntercalaire);
        Feuille newf;
        for (int i = 0; i < flist.size(); i++) {
            newf = flist.get(i);
            addFeuille(newf);
        }
        jNoteBloc.revalidate();
        jNoteBloc.repaint();
    }
    
    private void loadLabel(){
        cleartables(0);
           ArrayList<Feuille> feuilleLabel = origin.db.GetFeuillesByTag(jlabelBoxBG.getSelectedIndex()+1,this.idActiveUser);
           Feuille newf;
        Label newLab;
        for (int i = 0; i < feuilleLabel.size(); i++) {
            //System.out.println(list.get(i).getTitre());
                newf = feuilleLabel.get(i);
                addFeuille(newf);
        } 
        jNoteBloc.revalidate();
        jNoteBloc.repaint();
       }

    private void cleartables(int i) {
        if (i > 0) {
            jIntercalaireBloc.removeAll();
        }
        if (i > 1) {
            JClasseurBloc.removeAll();
        }
        jNoteBloc.removeAll();
        
    }


    private void unselect(int vaal){
        JLabel Icon;
        JPanel temp;
        switch (vaal){
            case 0:
                for(int i = 0;i<jNoteBloc.getComponentCount();i++){
                    temp = (JPanel)jNoteBloc.getComponent(i);
                    Icon = (JLabel)temp.getComponent(2);
                    Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/on@2x.png")));
                }
                jNoteBloc.revalidate();
                jNoteBloc.repaint();
                break;
            case 1:
                for(int i = 0;i<jIntercalaireBloc.getComponentCount();i++){
                    temp = (JPanel)jIntercalaireBloc.getComponent(i);
                    Icon = (JLabel)temp.getComponent(2);
                    Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/on@2x.png")));
                }
                jIntercalaireBloc.revalidate();
                jIntercalaireBloc.repaint();
                break;
            case 2:
                for(int i = 0;i<JClasseurBloc.getComponentCount();i++){
                    temp = (JPanel)JClasseurBloc.getComponent(i);
                    Icon = (JLabel)temp.getComponent(2);
                    Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/on@2x.png")));
                }
                JClasseurBloc.revalidate();
                JClasseurBloc.repaint();
                break;
        }
    }
    

    public void fillBox(ArrayList<Label> list) {

        jlabelBoxBG.removeAllItems();
        //System.out.println(list);
        //System.out.println(jlabelBoxBG);
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i).getLabel());
            jlabelBoxBG.addItem(list.get(i).getLabel());
        }
        System.out.println(jlabelBoxBG);
        jlabelBoxBG.revalidate();
        jlabelBoxBG.repaint();
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
        jPanel1 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
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
        jLabelboxPanel = new javax.swing.JPanel();
        jlabelBoxBG = new javax.swing.JComboBox<>();
        Jcenter = new javax.swing.JPanel();
        JClasseur = new javax.swing.JPanel();
        JaddClasseur = new javax.swing.JButton();
        JClasseurBloc = new javax.swing.JPanel();
        JIntercalaire = new javax.swing.JPanel();
        JaddIntercalaire = new javax.swing.JButton();
        jIntercalaireBloc = new javax.swing.JPanel();
        Jnote = new javax.swing.JPanel();
        JaddNote = new javax.swing.JButton();
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelColor)
                .addGap(69, 69, 69))
        );
        JLabelPaneLayout.setVerticalGroup(
            JLabelPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JLabelPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelColor))
        );

        jDiagPan.add(JLabelPane, java.awt.BorderLayout.NORTH);

        JpaneColor.setBackground(new java.awt.Color(32, 46, 64));
        JpaneColor.setMaximumSize(new java.awt.Dimension(100, 100));
        JpaneColor.setMinimumSize(new java.awt.Dimension(100, 100));
        JpaneColor.setPreferredSize(new java.awt.Dimension(100, 150));
        JpaneColor.setLayout(new java.awt.GridLayout(3, 4, 8, 8));

        Jblue.setBackground(new java.awt.Color(0, 0, 255));
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

        jPink.setBackground(new java.awt.Color(255, 0, 0));
        jPink.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPinkActionPerformed(evt);
            }
        });
        JpaneColor.add(jPink);

        jOrange.setBackground(new java.awt.Color(255, 3, 255));
        jOrange.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrangeActionPerformed(evt);
            }
        });
        JpaneColor.add(jOrange);

        jRed.setBackground(new java.awt.Color(255, 217, 26));
        jRed.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRedActionPerformed(evt);
            }
        });
        JpaneColor.add(jRed);

        jAmbre.setBackground(new java.awt.Color(255, 124, 0));
        jAmbre.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jAmbre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmbreActionPerformed(evt);
            }
        });
        JpaneColor.add(jAmbre);

        jFog.setBackground(new java.awt.Color(25, 255, 186));
        jFog.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jFog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFogActionPerformed(evt);
            }
        });
        JpaneColor.add(jFog);

        jCanari.setBackground(new java.awt.Color(179, 190, 255));
        jCanari.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCanari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCanariActionPerformed(evt);
            }
        });
        JpaneColor.add(jCanari);

        jMenthe.setBackground(new java.awt.Color(249, 117, 255));
        jMenthe.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jMenthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMentheActionPerformed(evt);
            }
        });
        JpaneColor.add(jMenthe);

        jVioloine.setBackground(new java.awt.Color(217, 255, 255));
        jVioloine.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jVioloine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVioloineActionPerformed(evt);
            }
        });
        JpaneColor.add(jVioloine);

        jChartreuse.setBackground(new java.awt.Color(117, 236, 250));
        jChartreuse.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jChartreuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChartreuseActionPerformed(evt);
            }
        });
        JpaneColor.add(jChartreuse);

        jKing.setBackground(new java.awt.Color(255, 50, 0));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(new java.awt.BorderLayout());

        JRoot.setMaximumSize(new java.awt.Dimension(1080, 720));
        JRoot.setPreferredSize(new java.awt.Dimension(1080, 720));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LlogoLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LlogoLayoutLayout.createSequentialGroup()
                    .addGap(0, 125, Short.MAX_VALUE)
                    .addComponent(JtextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
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

        Jcenterpanel.setMaximumSize(new java.awt.Dimension(980, 720));
        Jcenterpanel.setLayout(new java.awt.BorderLayout());

        Jtop.setBackground(new java.awt.Color(32, 46, 64));
        Jtop.setMaximumSize(new java.awt.Dimension(980, 100));
        Jtop.setMinimumSize(new java.awt.Dimension(980, 100));
        Jtop.setPreferredSize(new java.awt.Dimension(980, 100));

        JbtnSearch.setBackground(new Color(255,255,255,0));
        JbtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/label_search@2x.png"))); // NOI18N
        JbtnSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/label_search_neg@2x.png"))); // NOI18N
        JbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSearchActionPerformed(evt);
            }
        });

        jLabelboxPanel.setBackground(new java.awt.Color(32, 46, 64));

        jlabelBoxBG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jlabelBoxBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlabelBoxBGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLabelboxPanelLayout = new javax.swing.GroupLayout(jLabelboxPanel);
        jLabelboxPanel.setLayout(jLabelboxPanelLayout);
        jLabelboxPanelLayout.setHorizontalGroup(
            jLabelboxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelboxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelBoxBG, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jLabelboxPanelLayout.setVerticalGroup(
            jLabelboxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelboxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelBoxBG)
                .addContainerGap())
        );

        javax.swing.GroupLayout JtopLayout = new javax.swing.GroupLayout(Jtop);
        Jtop.setLayout(JtopLayout);
        JtopLayout.setHorizontalGroup(
            JtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JtopLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JbtnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelboxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JtopLayout.setVerticalGroup(
            JtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JtopLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(JtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JbtnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelboxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jLabelboxPanel.setVisible(false);

        Jcenterpanel.add(Jtop, java.awt.BorderLayout.NORTH);

        Jcenter.setMaximumSize(new java.awt.Dimension(980, 620));
        Jcenter.setPreferredSize(new java.awt.Dimension(980, 620));
        Jcenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        JClasseur.setBackground(new java.awt.Color(42, 70, 105));
        JClasseur.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(32, 46, 64), 4, true));
        JClasseur.setMaximumSize(new java.awt.Dimension(250, 620));
        JClasseur.setMinimumSize(new java.awt.Dimension(250, 620));
        JClasseur.setPreferredSize(new java.awt.Dimension(250, 620));

        JaddClasseur.setBackground(new Color(255,255,255,0));
        JaddClasseur.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        JaddClasseur.setForeground(new java.awt.Color(255, 255, 255));
        JaddClasseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        JaddClasseur.setText("  classeur");
        JaddClasseur.setAlignmentY(0.0F);
        JaddClasseur.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        JaddClasseur.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_neg.png"))); // NOI18N
        JaddClasseur.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_roll.png"))); // NOI18N
        JaddClasseur.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JaddClasseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddClasseurActionPerformed(evt);
            }
        });

        JClasseurBloc.setBackground(new java.awt.Color(42, 70, 105));
        JClasseurBloc.setAlignmentX(0.0F);
        JClasseurBloc.setAutoscrolls(true);
        JClasseurBloc.setMaximumSize(new java.awt.Dimension(230, 540));
        JClasseurBloc.setMinimumSize(new java.awt.Dimension(230, 540));
        JClasseurBloc.setPreferredSize(new java.awt.Dimension(230, 540));
        JClasseurBloc.setLayout(new java.awt.GridLayout(10, 1));

        javax.swing.GroupLayout JClasseurLayout = new javax.swing.GroupLayout(JClasseur);
        JClasseur.setLayout(JClasseurLayout);
        JClasseurLayout.setHorizontalGroup(
            JClasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JClasseurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JClasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JClasseurLayout.createSequentialGroup()
                        .addComponent(JClasseurBloc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(JClasseurLayout.createSequentialGroup()
                        .addComponent(JaddClasseur)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        JClasseurLayout.setVerticalGroup(
            JClasseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JClasseurLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JaddClasseur)
                .addGap(18, 18, 18)
                .addComponent(JClasseurBloc, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );

        Jcenter.add(JClasseur);

        JIntercalaire.setBackground(new java.awt.Color(42, 70, 105));
        JIntercalaire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 46, 64), 4));
        JIntercalaire.setMaximumSize(new java.awt.Dimension(350, 620));
        JIntercalaire.setMinimumSize(new java.awt.Dimension(350, 620));
        JIntercalaire.setPreferredSize(new java.awt.Dimension(350, 620));

        JaddIntercalaire.setBackground(new Color(255,255,255,0));
        JaddIntercalaire.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        JaddIntercalaire.setForeground(new java.awt.Color(255, 255, 255));
        JaddIntercalaire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        JaddIntercalaire.setText("  intercalaire");
        JaddIntercalaire.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        JaddIntercalaire.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_neg.png"))); // NOI18N
        JaddIntercalaire.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_roll.png"))); // NOI18N
        JaddIntercalaire.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JaddIntercalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddIntercalaireActionPerformed(evt);
            }
        });

        jIntercalaireBloc.setBackground(new java.awt.Color(42, 70, 105));
        jIntercalaireBloc.setAlignmentX(0.0F);
        jIntercalaireBloc.setAutoscrolls(true);
        jIntercalaireBloc.setMaximumSize(new java.awt.Dimension(330, 540));
        jIntercalaireBloc.setMinimumSize(new java.awt.Dimension(330, 540));
        jIntercalaireBloc.setPreferredSize(new java.awt.Dimension(330, 540));
        jIntercalaireBloc.setLayout(new java.awt.GridLayout(10, 1));

        javax.swing.GroupLayout JIntercalaireLayout = new javax.swing.GroupLayout(JIntercalaire);
        JIntercalaire.setLayout(JIntercalaireLayout);
        JIntercalaireLayout.setHorizontalGroup(
            JIntercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIntercalaireLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JIntercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JIntercalaireLayout.createSequentialGroup()
                        .addComponent(jIntercalaireBloc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(JIntercalaireLayout.createSequentialGroup()
                        .addComponent(JaddIntercalaire)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JIntercalaireLayout.setVerticalGroup(
            JIntercalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JIntercalaireLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JaddIntercalaire)
                .addGap(18, 18, 18)
                .addComponent(jIntercalaireBloc, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );

        Jcenter.add(JIntercalaire);

        Jnote.setBackground(new java.awt.Color(42, 70, 105));
        Jnote.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(32, 46, 64), 4, true));
        Jnote.setMaximumSize(new java.awt.Dimension(380, 620));
        Jnote.setMinimumSize(new java.awt.Dimension(380, 620));
        Jnote.setPreferredSize(new java.awt.Dimension(380, 620));

        JaddNote.setBackground(new Color(255,255,255,0));
        JaddNote.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        JaddNote.setForeground(new java.awt.Color(255, 255, 255));
        JaddNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        JaddNote.setText("  note");
        JaddNote.setToolTipText("");
        JaddNote.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        JaddNote.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_neg.png"))); // NOI18N
        JaddNote.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_roll.png"))); // NOI18N
        JaddNote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JaddNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddNoteActionPerformed(evt);
            }
        });

        jNoteBloc.setBackground(new java.awt.Color(42, 70, 105));
        jNoteBloc.setAlignmentX(0.0F);
        jNoteBloc.setAutoscrolls(true);
        jNoteBloc.setMaximumSize(new java.awt.Dimension(360, 540));
        jNoteBloc.setMinimumSize(new java.awt.Dimension(360, 540));
        jNoteBloc.setPreferredSize(new java.awt.Dimension(360, 540));
        jNoteBloc.setLayout(new java.awt.GridLayout(10, 1));

        javax.swing.GroupLayout JnoteLayout = new javax.swing.GroupLayout(Jnote);
        Jnote.setLayout(JnoteLayout);
        JnoteLayout.setHorizontalGroup(
            JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JnoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNoteBloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JaddNote))
                .addGap(10, 10, 10))
        );
        JnoteLayout.setVerticalGroup(
            JnoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JnoteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JaddNote)
                .addGap(18, 18, 18)
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
        SelectedColorBtn = jGreen.getBackground();
    }//GEN-LAST:event_jGreenActionPerformed

    private void JblueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JblueActionPerformed
        // TODO add your handling code here:
        // colors = nuancier.colors[0];
        SelectedColorBtn = Jblue.getBackground();
    }//GEN-LAST:event_JblueActionPerformed

    private void jPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPinkActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jPink.getBackground();
    }//GEN-LAST:event_jPinkActionPerformed

    private void jOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrangeActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jOrange.getBackground();
    }//GEN-LAST:event_jOrangeActionPerformed

    private void jRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRedActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jRed.getBackground();
    }//GEN-LAST:event_jRedActionPerformed

    private void jAmbreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmbreActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jAmbre.getBackground();
    }//GEN-LAST:event_jAmbreActionPerformed

    private void jFogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFogActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jFog.getBackground();
    }//GEN-LAST:event_jFogActionPerformed

    private void jCanariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCanariActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jCanari.getBackground();
    }//GEN-LAST:event_jCanariActionPerformed

    private void jMentheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMentheActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jCanari.getBackground();
    }//GEN-LAST:event_jMentheActionPerformed

    private void jVioloineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVioloineActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jVioloine.getBackground();
    }//GEN-LAST:event_jVioloineActionPerformed

    private void jChartreuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChartreuseActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jChartreuse.getBackground();
    }//GEN-LAST:event_jChartreuseActionPerformed

    private void jKingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKingActionPerformed
        // TODO add your handling code here:
        SelectedColorBtn = jKing.getBackground();
    }//GEN-LAST:event_jKingActionPerformed


    private void JaddClasseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddClasseurActionPerformed
        // TODO add your handling code here:
        int i = origin.db.PostClasseur("New", "666666", this.idActiveUser);
        addClasseur(new Classeur(i, "New", "333333"));
    }//GEN-LAST:event_JaddClasseurActionPerformed

    private void JaddIntercalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddIntercalaireActionPerformed
        // TODO add your handling code here:
        int i = origin.db.PostIntercalaire("New", "333333", this.idActiveClasseur);
        addIntercalaire(new Intercalaire(i, "New", "333333"));
    }//GEN-LAST:event_JaddIntercalaireActionPerformed

    private void addClasseur(Classeur newcla) {
        // variables
        JPanel panelBloc = new JPanel();
        JButton jSelectedColors = new JButton();
        JLabel jIconOn = new JLabel();

        panelBloc.setBackground(new java.awt.Color(42, 70, 105));
        panelBloc.setMaximumSize(new Dimension(205, 40));
        panelBloc.setMinimumSize(new java.awt.Dimension(205, 40));
        panelBloc.setName(""); // NOI18N
        panelBloc.setPreferredSize(new java.awt.Dimension(205, 40));
        panelBloc.setAlignmentX(0.0F);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 0);
        flowLayout1.setAlignOnBaseline(true);
        panelBloc.setLayout(flowLayout1);

        // bouton sélecteur de couleur
        jSelectedColors.setBackground(Color.decode(newcla.getCol()));
        jSelectedColors.setAlignmentY(0.0F);
        jSelectedColors.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jSelectedColors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jSelectedColors.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jSelectedColors.setMaximumSize(new java.awt.Dimension(15, 30));
        jSelectedColors.setMinimumSize(new java.awt.Dimension(15, 30));
        jSelectedColors.setPreferredSize(new java.awt.Dimension(15, 30));
        jSelectedColors.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog();
                jSelectedColors.setBackground(SelectedColorBtn);
            }
        }
        );
        panelBloc.add(jSelectedColors);

        // champs texte nom classeur 
        JTextField JTextClasseur = new JTextField();
        JTextClasseur.setText(newcla.getLib());

        JTextClasseur.setBackground(
                new java.awt.Color(42, 70, 105));
        JTextClasseur.setFont(
                new java.awt.Font("URW Gothic", 0, 16)); // NOI18N
        JTextClasseur.setForeground(
                new java.awt.Color(255, 255, 255));
        JTextClasseur.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTextClasseur.setText(newcla.getLib());
        JTextClasseur.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        JTextClasseur.setMargin(
                new java.awt.Insets(2, 2, 2, 2));
        JTextClasseur.setMaximumSize(
                new java.awt.Dimension(155, 20));
        JTextClasseur.setMinimumSize(
                new java.awt.Dimension(155, 20));
        JTextClasseur.setPreferredSize(
                new java.awt.Dimension(155, 20));
        jIconOn.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unselect(2);
                jIconOn.setIcon(new ImageIcon(getClass().getResource("/resources/off@2x.png")));
                setClasseur(newcla.getId());
                String hex = Integer.toHexString(jSelectedColors.getBackground().getRGB()).substring(2);
                //System.out.println("contenu JTextClasseur " + JTextClasseur.getText());
                //System.out.println("BG du bouton couleur " + hex);
                origin.db.UpdateClasseur(JTextClasseur.getText(), hex, newcla.getId());

            }
        });
        panelBloc.add(JTextClasseur);

        // bouton icon lien vers intercalaire
        jIconOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/on@2x.png"))); // NOI18N
        panelBloc.add(jIconOn);
        jIconOn.getAccessibleContext().setAccessibleName("jIconOn");

        JClasseurBloc.add(panelBloc);

        // regénère le composant
        panelBloc.revalidate();
        panelBloc.repaint();

    }

    private void addIntercalaire(Intercalaire newIn) {
        // variables
        JPanel panelBloc = new JPanel();
        JButton jSelectedColors = new JButton();
        JLabel jIconOn = new JLabel();

        panelBloc.setBackground(new java.awt.Color(42, 70, 105));
        panelBloc.setMaximumSize(new Dimension(330, 40));
        panelBloc.setMinimumSize(new java.awt.Dimension(330, 40));
        panelBloc.setName(""); // NOI18N
        panelBloc.setPreferredSize(new java.awt.Dimension(330, 40));
        panelBloc.setAlignmentX(0.0F);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 0);
        flowLayout1.setAlignOnBaseline(true);
        panelBloc.setLayout(flowLayout1);

        // bouton sélecteur de couleur
        jSelectedColors.setBackground(Color.decode(newIn.getCol()));
        jSelectedColors.setAlignmentY(0.0F);
        jSelectedColors.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jSelectedColors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jSelectedColors.setMargin(new java.awt.Insets(2, 2, 2, 0));
        jSelectedColors.setMaximumSize(new java.awt.Dimension(15, 30));
        jSelectedColors.setMinimumSize(new java.awt.Dimension(15, 30));
        jSelectedColors.setPreferredSize(new java.awt.Dimension(15, 30));
        jSelectedColors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialog();
                jSelectedColors.setBackground(SelectedColorBtn);
            }
        });
        panelBloc.add(jSelectedColors);

        // champs texte nom intercalaire 
        JTextField JTextIntercalaire = new JTextField();
        JTextIntercalaire.setText(newIn.getLib());
        //System.out.println(newIn.getLib());

        JTextIntercalaire.setBackground(new java.awt.Color(42, 70, 105));
        JTextIntercalaire.setFont(new java.awt.Font("URW Gothic", 0, 16)); // NOI18N
        JTextIntercalaire.setForeground(new java.awt.Color(255, 255, 255));
        JTextIntercalaire.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTextIntercalaire.setText(newIn.getLib());
        JTextIntercalaire.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        JTextIntercalaire.setMargin(new java.awt.Insets(2, 2, 2, 0));
        JTextIntercalaire.setMaximumSize(new java.awt.Dimension(250, 20));
        JTextIntercalaire.setMinimumSize(new java.awt.Dimension(250, 20));
        JTextIntercalaire.setPreferredSize(new java.awt.Dimension(250, 20));
        jIconOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unselect(1);
                jIconOn.setIcon(new ImageIcon(getClass().getResource("/resources/off@2x.png")));
                setIntercalaire(newIn.getId());
                //System.out.println("intercalaires " + newIn.getLib());
                String hex = Integer.toHexString(jSelectedColors.getBackground().getRGB()).substring(2);
                origin.db.UpdateIntercalaire(JTextIntercalaire.getText(), hex, newIn.getId());
            }
        });
        panelBloc.add(JTextIntercalaire);

        // bouton icon lien vers intercalaire
        jIconOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/on@2x.png"))); // NOI18N
        panelBloc.add(jIconOn);
        jIconOn.getAccessibleContext().setAccessibleName("jIconOn");

        jIntercalaireBloc.add(panelBloc);

        // regénère le composant
        panelBloc.revalidate();
        panelBloc.repaint();
    }

    private void addFeuille(Feuille newf) {
        JPanel panelBloc = new JPanel(); //not invoke "javax.swing.JButton.setBackground(java.awt.Color)" because "this.jSelectedColors" is null
        JLabel jIconOn = new JLabel();

        panelBloc.setBackground(new java.awt.Color(42, 70, 105));
        panelBloc.setMaximumSize(new Dimension(360, 40));
        panelBloc.setMinimumSize(new java.awt.Dimension(360, 40));
        panelBloc.setName(""); // NOI18N
        panelBloc.setPreferredSize(new java.awt.Dimension(360, 40));
        panelBloc.setAlignmentX(0.0F);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 0);
        flowLayout1.setAlignOnBaseline(true);
        panelBloc.setLayout(flowLayout1);

        // champs texte nom intercalaire 
        JTextField JNotes = new JTextField();
        JNotes.setText(newf.getTitre());
        //System.out.println("feuilles : " + newf.getTitre());

        JNotes.setBackground(new java.awt.Color(42, 70, 105));
        JNotes.setFont(new java.awt.Font("URW Gothic", 0, 16)); // NOI18N
        JNotes.setForeground(new java.awt.Color(255, 255, 255));
        JNotes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JNotes.setText(newf.getTitre());
        JNotes.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        JNotes.setMargin(new java.awt.Insets(5, 2, 0, 2));
        JNotes.setMaximumSize(new java.awt.Dimension(310, 30));
        JNotes.setMinimumSize(new java.awt.Dimension(310, 30));
        JNotes.setPreferredSize(new java.awt.Dimension(310, 30));
        jIconOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconOn.setIcon(new ImageIcon(getClass().getResource("/resources/off@2x.png")));
                origin.editor(newf.getId());
            }
        });
        panelBloc.add(JNotes);
        jNoteBloc.add(panelBloc);

        jIconOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/on@2x.png"))); // NOI18N
        panelBloc.add(jIconOn);
        jIconOn.getAccessibleContext().setAccessibleName("jIconOn");
        // regénère le composant
        panelBloc.revalidate();
        panelBloc.repaint();

    }
    
       
       

    private void JaddNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddNoteActionPerformed
        // TODO add your handling code here:
        //int i = origin.db.PostFeuille("Nouvelle Note", "", this.idActiveIntercalaire);
        //origin.editor(1);
        int i = origin.db.PostFeuille("New", "333333", this.idActiveIntercalaire);
        addFeuille(new Feuille(i, "New", "333333"));
    }//GEN-LAST:event_JaddNoteActionPerformed


    private void jlabelBoxBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlabelBoxBGActionPerformed

        //System.out.println("item Box " + origin.db.GetFeuillesByTag(jlabelBoxBG.getSelectedIndex()));
        loadLabel();
    }//GEN-LAST:event_jlabelBoxBGActionPerformed

    private void JbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSearchActionPerformed
        // TODO add your handling code here:
        jLabelboxPanel.setVisible(true);
    }//GEN-LAST:event_JbtnSearchActionPerformed

    private void jSelectedColorsActionPerformed(ActionEvent e) {
        dialog();
    }

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
    private javax.swing.JPanel JLabelPane;
    private javax.swing.JPanel JRoot;
    private javax.swing.JDialog JSelected;
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
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JPanel jDiagPan;
    private javax.swing.JButton jFog;
    private javax.swing.JButton jGreen;
    private javax.swing.JPanel jIntercalaireBloc;
    private javax.swing.JButton jKing;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JPanel jLabelboxPanel;
    private javax.swing.JButton jMenthe;
    private javax.swing.JPanel jNewNote;
    private javax.swing.JPanel jNoteBloc;
    private javax.swing.JButton jOrange;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPink;
    private javax.swing.JButton jRed;
    private javax.swing.JButton jVioloine;
    private javax.swing.JComboBox<String> jlabelBoxBG;
    // End of variables declaration//GEN-END:variables

}
