/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.JTextComponent;

/**
 *
 * @author psylo
 */
public class EditorPane extends JPanel {

    private Home origin;
    
    private JPanel savePanel; // contient le bouton enregistrer la note
    private JPanel titlePanel; // contient le titre de la note
    private JPanel notePane; // container principal contenant le titre, la note et le bouton enregistrer
    private JPanel contentText; // container pour le JTextPane de la note (textPane)
    private JPanel titleButtonPanel; // panel avec les boutons pour modifier le title
    private JPanel labelPane; // container ou les labels s'affichent
    
    private JTextPane textPane; //texte principal de la note
    private JTextField titleLb; // label qui affiche le titre
    private JButton editTitleButton; // bouton pour modifier le titre
    private JButton saveTitleButton; //bouton pour sauvegarder le texte modifier
    
    private JPanel labelField;// affiche les labels liés à la liste
    private JButton editLabelButton; // bouton qui ouvre la modal de modification de label
    private JLabel labelTitle; // annonce des labels
    
    private JButton ReadButton; // bouton qui ouvre le fichier
    private JComboBox sizeBox; // taille de la police
    private JButton boldButton; // met le texte en gras
    private JButton italicButton; //met le texte en italique
    private JButton colorButton; // colorPicker et mise en couleur du texte
    private JButton saveNoteButton; // bouton qui sauvegarde le contenu de la note
    private JButton addNewLabelButton;// bouton qui ajoute un nouveau label
    private JComboBox fontBox; //change la typographie

    private ImageIcon edit_Icon = new ImageIcon(getClass().getResource("/resources/doc.png")); //icône de modifications
    private ImageIcon editIcon = new ImageIcon(edit_Icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)); //icône de modifications redimensionnée
    private ImageIcon save_Icon = new ImageIcon(getClass().getResource("/resources/save_roll@4x.png")); //icône de sauvegarde
    private ImageIcon saveIcon = new ImageIcon(save_Icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));; //icône de sauvegarde redimensionnée 
    private ImageIcon add_Icon = new ImageIcon(getClass().getResource("/resources/add.png"));
    private ImageIcon addIcon = new ImageIcon(add_Icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
   
    
    private LabelClass labelClass; //classe label
    
    private String[] fontName;
    private String charset = "UTF-8";
    private String cheminDeFichier = "C:/Users/psylo/Downloads/Demo.txt"; // pour les sauvegardes dans un fichier

    public EditorPane() {

        initBlocNotes();

    }

    private void initBlocNotes() {
        // j'initie la barre avec les boutons de style
        savePanel = new JPanel();
        textPane = new JTextPane();
        notePane = new JPanel();
        contentText = new JPanel();
        titlePanel = new JPanel();
        titleButtonPanel = new JPanel();
        titleLb = new JTextField();
    
        // Je créé les marges pour le texte tapé
        Insets insets = new Insets(5, 5, 5, 5);

        // mise en couleur des backgrounds des panels
        titleLb.setBackground(Color.WHITE);
        titleLb.setForeground(new Color(23, 106, 115));
        titlePanel.setBackground(Color.WHITE);
        textPane.setBackground(Color.WHITE);
        savePanel.setBackground(Color.WHITE);
        titleButtonPanel.setBackground(Color.WHITE);

        // mise en place des layout principaux
        this.setLayout(new BorderLayout());
        savePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        

        textPane.setEditable(true);
        textPane.setContentType("text/html");
        textPane.setForeground(new Color(23, 106, 115));
        textPane.setText("Vous pouvez commencer à écrire ! ");
        textPane.setMargin(insets);

        // J'ajoute le MouseListener pour la sélection de texte
        textPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                changeStyle(null, null);
            }
        });

        // Je mets mon bouton sauvegarder dans un panel pour pouvoir l'afficher à droite
        saveNoteButton = new JButton("Enregistrer");
        saveNoteButton.setBackground(new Color(32, 46, 64));
        saveNoteButton.setForeground(Color.WHITE);
        saveNoteButton.setFont(new Font("Arial", Font.BOLD, 18));
        saveNoteButton.setPreferredSize(new Dimension(150, 40));
        saveNoteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0), 0));
        saveNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                sauvegarder();
            }
        });
        savePanel.add(saveNoteButton);

        titleLb.setText("Title");
        titleLb.setFont(new Font("Arial", Font.BOLD, 20));
        titleLb.setEditable(false);
        titleLb.setMargin(insets);
        titleLb.setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));

        editTitleButton = new JButton();
        editTitleButton.setIcon(editIcon);
        editTitleButton.setBackground(Color.white);
        editTitleButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));
        editTitleButton.setBorderPainted(false);
        editTitleButton.setPreferredSize(new Dimension(50, 30));
        editTitleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                editTitleButton.setVisible(false);
                saveTitleButton.setVisible(true);
                titleLb.setEditable(true);
            }
        });

        saveTitleButton = new JButton();
        saveTitleButton.setIcon(saveIcon);
        saveTitleButton.setBackground(new Color(230, 233, 240));
        saveTitleButton.setBorderPainted(false);
        saveTitleButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));
        saveTitleButton.setVisible(false);
        saveTitleButton.setPreferredSize(new Dimension(50, 30));
        saveTitleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                editTitleButton.setVisible(true);
                saveTitleButton.setVisible(false);
                titleLb.setEditable(false);
// enregistrer le Title en BDD /////////////////////////////////////////////////////////////////////////////////////////////////
            }
        });

        titleButtonPanel.add(editTitleButton);
        titleButtonPanel.add(saveTitleButton);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.add(titleLb, BorderLayout.CENTER);
        titlePanel.add(titleButtonPanel, BorderLayout.EAST);

        contentText.setLayout(new BorderLayout());
        contentText.add(textPane, BorderLayout.CENTER);

        notePane.setLayout(new BorderLayout());
        notePane.add(titlePanel, BorderLayout.NORTH);
        notePane.add(contentText, BorderLayout.CENTER);
        notePane.add(savePanel, BorderLayout.SOUTH);

        // J'ajoute la possibilité de scroller la fenêtre et je place le texte et le panel des boutons
        this.add(createToolBar(), BorderLayout.NORTH);
        this.add(new JScrollPane(notePane), BorderLayout.CENTER);
        this.add(createLabelPane(), BorderLayout.SOUTH);

    }

    private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();

        toolBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        toolBar.setBackground(new Color(42, 70, 105));
        toolBar.setForeground(Color.WHITE);

        ReadButton = new JButton("Fichier");
        ReadButton.setFont(new Font("Arial", Font.BOLD, 18));
        ReadButton.setBackground(new Color(206, 222, 242));
        ReadButton.setForeground(Color.WHITE);
        ReadButton.setBorderPainted(false); // enlève la bordure
        ReadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                lecture();
            }
        });

        // le comboBox size
        sizeBox = this.createSizeBox();
        sizeBox.setFont(new Font("Arial", Font.BOLD, 18));
        sizeBox.setBackground(new Color(255, 255, 255));
        sizeBox.setPreferredSize(new Dimension(75, 30));
        sizeBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lorsque la sélection change, appeler la méthode changeStyle avec le paramètre
                // "fSize"
                changeStyle("fSize", sizeBox.getSelectedItem().toString());
            }
        });

        // Le bouton Gras :
        boldButton = new JButton("G");
        boldButton.setFont(new Font("Arial", Font.BOLD, 18));
        boldButton.setBackground(new Color(206, 222, 242));
        boldButton.setForeground(Color.WHITE);
        boldButton.setBorderPainted(false); // enlève la bordure
        boldButton.setPreferredSize(new Dimension(50, 30));
        boldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeStyle("bold", null);
            }
        });

        // Le bouton Italique
        italicButton = new JButton("i");
        italicButton.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 18));
        italicButton.setBackground(new Color(206, 222, 242));
        italicButton.setForeground(Color.WHITE);
        italicButton.setBorderPainted(false); // enlève la bordure
        italicButton.setPreferredSize(new Dimension(50, 30));
        italicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeStyle("italic", null);
            }
        });

        // le color picker
        colorButton = new JButton("Color");
        colorButton.setFont(new Font("Arial", Font.BOLD, 18));
        colorButton.setBackground(new Color(206, 222, 242));
        colorButton.setForeground(Color.WHITE);
        colorButton.setBorderPainted(false); // enlève la bordure
        colorButton.setPreferredSize(new Dimension(100, 30));
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // ouvre la boîte à couleur
                if (e.getSource() == colorButton) {
                    changeStyle("colors", null);
                }
            }
        });

        fontBox = createFontBox();
        fontBox.setFont(new Font("Arial", Font.BOLD, 16));
        fontBox.setBackground(new Color(255, 255, 255));
        fontBox.setPreferredSize(new Dimension(150, 30));
        fontBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lorsque la sélection change, appeler la méthode changeStyle avec le paramètre
                // "fSize"
                changeStyle("newFont", fontBox.getSelectedItem().toString()); // J'ai récupéré un objet, je le
                                                                              // transforme en String pour pouvoir
                                                                              // l'utiliser dans le changement de style
            }
        });

        toolBar.add(ReadButton);
        toolBar.add(fontBox);
        toolBar.add(sizeBox);
        toolBar.add(boldButton);
        toolBar.add(italicButton);
        toolBar.add(colorButton);

        return toolBar;
    }

    private JPanel createLabelPane(){
        labelPane = new JPanel();
        labelField = new JPanel();
        addNewLabelButton = new JButton();
        editLabelButton = new JButton();
        labelTitle = new JLabel();
        labelClass = new LabelClass();
        
        labelPane.setBackground(new Color(23, 106, 115));
        labelPane.setLayout(new FlowLayout(FlowLayout.LEFT));
        labelField.setBackground(new Color(23, 106, 115));
        labelClass.setBackground(new Color(23, 106, 115));

        editLabelButton.setIcon(editIcon);
        editLabelButton.setPreferredSize(new Dimension(50, 40));
        
        addNewLabelButton.setIcon(addIcon);
        addNewLabelButton.setPreferredSize(new Dimension(50, 40));
        addNewLabelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // ouvre la modale
                JModalLabel modal = new JModalLabel(origin, "Labels : ", true);
                modal.displayLabelBox();
                modal.setVisible(true);
            }
        });
        
        labelTitle.setText("Labels : ");
        labelTitle.setForeground(Color.WHITE);
        labelTitle.setFont(new Font("Arial", Font.BOLD, 16));
        labelTitle.setPreferredSize(new Dimension(75, 40));
        labelTitle.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        labelField.setBorder(BorderFactory.createLineBorder(new Color(230, 233, 240), 0));
        labelField.setFont(new Font("Arial", Font.BOLD, 16));
        labelField.setPreferredSize(new Dimension(600, 40));
        labelField.setLayout(new FlowLayout(FlowLayout.LEFT));
   
        labelField.add(labelClass);
        labelPane.add(editLabelButton);
        labelPane.add(addNewLabelButton);
        labelPane.add(labelTitle);
        labelPane.add(labelField);
        return labelPane;  
    } 

    // Création du menu déroulant pour la typographie
    public JComboBox createFontBox() {
        Font[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        fontName = new String[fonts.length];
        for (int i = 0; i < fonts.length; i++) {
            fontName[i] = String.valueOf(fonts[i].getName()); // Je récupère le nom de chaque font contenue dans le
                                                              // tableaux fonts, pour l'intégrer à la comboBox
        }
        JComboBox box = new JComboBox(fontName);
        return box;
    }

    // Création du menu déroulant pour la fontSize
    public JComboBox createSizeBox() {
        JComboBox box = new JComboBox();
        for (int i = 6; i <= 100; i++) {
            box.addItem(Integer.toString(i)); // Je transforme l'int i en string pour pouvoir l'injecter dans la
                                              // comboBox
        }
        return box;
    }
    
    
    //Change le style du contenu de la note
    private void changeStyle(String typeStyle, String font) {

        StyledDocument doc = textPane.getStyledDocument();

        // Je sélectionne le début et la fin de la sélection à la souris
        int start = textPane.getSelectionStart();
        int end = textPane.getSelectionEnd();
        String selectedField = textPane.getSelectedText();

        // je récupère les attributs actuels de l'élément sélectionné
        AttributeSet currentAtt = doc.getCharacterElement(start).getAttributes();

        // Je créé un nouveau style basé sur le style existant pour éviter les problèmes
        // d'indentation dues au MutableAttributeSet que j'ai enlevé.
        Style style = textPane.getStyle(selectedField);
        if (style == null) {
            style = textPane.addStyle(selectedField, null);
        }

        // J'applique les attributs existants au nouveau style
        StyleConstants.setBold(style, StyleConstants.isBold(currentAtt));
        StyleConstants.setItalic(style, StyleConstants.isItalic(currentAtt));
        StyleConstants.setForeground(style, StyleConstants.getForeground(currentAtt));

        switch (typeStyle) {
            case "bold":
                StyleConstants.setBold(style, !StyleConstants.isBold(currentAtt));
                break;
            case "italic":
                // Si le texte est en gras, !StyleConstants.isItalic(currentAtt) enlèvera le
                // gras si on sélectinne et clique à nouveau sur le bouton
                StyleConstants.setItalic(style, !StyleConstants.isItalic(currentAtt));
                break;
            case "colors":
                Color color = JColorChooser.showDialog(null, "Choisis ta couleur", Color.black);
                if (color != null) { // Si une couleur est choisie, je l'applique au texte
                    StyleConstants.setForeground(style, color);
                }
                break;
            case "fSize":
                int fontSize = Integer.parseInt(font);
                StyleConstants.setFontSize(style, fontSize);
                break;
            case "newFont":
                StyleConstants.setFontFamily(style, font);
            default:
                break;
        }

        // j'applique la modification de style à la sélection : start = début de la
        // sélection, end-start = longueur de la sélextion, style = l'ensemble des
        // styles à appliquer, true = true
        doc.setCharacterAttributes(start, end - start, style, true);

    }
    
    
    
    
    //sauvegarde le document/la note ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void sauvegarder() {
        try {
            Writer save = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(cheminDeFichier), charset)); // OutputStreamWriter
                                                                                                                      // permet
                                                                                                                      // d'utiliser
                                                                                                                      // l'utf-8
            System.out.println(textPane.getText());
            System.out.println(titleLb.getText());
            textPane.write(save);
            save.close();
            textPane.requestFocus();
            JOptionPane.showMessageDialog(null, "Le fichier texte est créé et écrit dans " + cheminDeFichier);
        } catch (UnsupportedEncodingException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    };

//charger la note ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void lecture() {
        try {
            JFileChooser chooser = new JFileChooser(); // ouvre la fenêtre dialogue pour parcourir répertoire et
                                                       // fichiers
            chooser.showOpenDialog(null);
            File fichier = chooser.getSelectedFile();
            String nomFichier = fichier.getAbsolutePath();

            try {
                BufferedReader openFile = new BufferedReader(
                        new InputStreamReader(new FileInputStream(nomFichier), charset));
                textPane.read(openFile, null);
                openFile.close();
                textPane.requestFocus(); // se met en position initiale
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Opération annulée !!!", "Information",
                    JOptionPane.INFORMATION_MESSAGE);

        }

    }

}
