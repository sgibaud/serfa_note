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

    JPanel buttonPanel;
    JPanel savePanel;
    JPanel titlePanel;
    JPanel notePane;
    JPanel contentText;
    JPanel titleButtonPanel;
    JPanel labelPane;
    JTextField labelField;
    JTextPane textPane;
    JTextField titleLb;
    JTextField newLabelField;
    JButton modifTitle;
    JButton sauvTitleButton;
    JButton editLabelButton;
    JButton saveLabelButton;
    JButton deleteLabelButton;
    JButton saveNewLabel;

    JButton ReadButton;
    JComboBox sizeBox;
    JButton boldButton;
    JButton italicButton;
    JButton colorButton;
    JButton saveEditor;
    JButton addNewLabel;
    JComboBox fontBox;
    JComboBox labelBox;

    ImageIcon editTitle;
    ImageIcon edit_Title;
    ImageIcon saveTitle;
    ImageIcon save_Title;

    LabelClass labelClass;
    String[] fontName;

    String charset = "UTF-8";
    String cheminDeFichier = "C:/Users/psylo/Downloads/Demo.txt"; // pour les sauvegardes dans un fichier
    String itemLabel;

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
        labelPane = new JPanel();
        labelField = new JTextField();
        labelClass = new LabelClass();

        // Je créé les icônes pour les mettre dans les boutons
        edit_Title = new ImageIcon(getClass().getResource("/resources/doc.png"));
        save_Title = new ImageIcon(getClass().getResource("/resources/save_roll@4x.png"));

        // Je les retaille
        ImageIcon editTitle = new ImageIcon(edit_Title.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)); // retaille
                                                                                                                   // l'image
        ImageIcon saveTitle = new ImageIcon(save_Title.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)); //

        // Je créé les marges pour le texte tapé
        Insets insets = new Insets(5, 5, 5, 5);

        // mise en couleur des backgrounds des panels
        titleLb.setBackground(new Color(230, 233, 240));
        titlePanel.setBackground(new Color(230, 233, 240));
        textPane.setBackground(new Color(230, 233, 240));
        savePanel.setBackground(new Color(230, 233, 240));
        titleButtonPanel.setBackground(new Color(230, 233, 240));

        // mise en place des layout principaux
        this.setLayout(new BorderLayout());
        savePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        labelPane.setLayout(new FlowLayout(FlowLayout.LEFT));

        textPane.setEditable(true);
        textPane.setContentType("text/html");
        textPane.setText("Ceci est un exemple de texte avec différents mots.");
        textPane.setMargin(insets);

        // J'ajoute le MouseListener pour la sélection de texte
        textPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                changeStyle(null, null);
            }
        });

        // Je mets mon bouton sauvegarder dans un panel pour pouvoir l'afficher à droite
        saveEditor = new JButton("Enregistrer");
        saveEditor.setBackground(new Color(206, 222, 242));
        saveEditor.setFont(new Font("Arial", Font.BOLD, 18));
        saveEditor.setPreferredSize(new Dimension(150, 40));
        saveEditor.setBorder(BorderFactory.createLineBorder(new Color(149, 145, 242), 2));
        saveEditor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                sauvegarder();
            }
        });
        savePanel.add(saveEditor);

        titleLb.setText("Title");
        titleLb.setFont(new Font("Arial", Font.BOLD, 20));
        titleLb.setEditable(false);
        titleLb.setMargin(insets);
        titleLb.setBorder(null);

        modifTitle = new JButton();
        modifTitle.setIcon(editTitle);
        modifTitle.setBackground(new Color(230, 233, 240));
        modifTitle.setBorderPainted(false);
        modifTitle.setPreferredSize(new Dimension(50, 30));
        modifTitle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                modifTitle.setVisible(false);
                sauvTitleButton.setVisible(true);
                titleLb.setEditable(true);
            }
        });

        sauvTitleButton = new JButton();
        sauvTitleButton.setIcon(saveTitle);
        sauvTitleButton.setBackground(new Color(230, 233, 240));
        sauvTitleButton.setBorderPainted(false);
        sauvTitleButton.setVisible(false);
        sauvTitleButton.setPreferredSize(new Dimension(50, 30));
        sauvTitleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                modifTitle.setVisible(true);
                sauvTitleButton.setVisible(false);
                titleLb.setEditable(false);
// enregistrer le Title en BDD /////////////////////////////////////////////////////////////////////////////////////////////////
            }
        });

        titleButtonPanel.add(modifTitle);
        titleButtonPanel.add(sauvTitleButton);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.add(titleLb, BorderLayout.CENTER);
        titlePanel.add(titleButtonPanel, BorderLayout.EAST);

        contentText.setLayout(new BorderLayout());
        contentText.add(textPane, BorderLayout.CENTER);

        notePane.setLayout(new BorderLayout());
        notePane.add(titlePanel, BorderLayout.NORTH);
        notePane.add(contentText, BorderLayout.CENTER);
        notePane.add(savePanel, BorderLayout.SOUTH);

        editLabelButton = new JButton("Modifier");
        saveLabelButton = new JButton("Sauvegarder");
        deleteLabelButton = new JButton("Supprimer");
        editLabelButton.setVisible(false);
        saveLabelButton.setVisible(false);
        deleteLabelButton.setVisible(false);

        labelField.setColumns(20);
        labelField.setBorder(null);
        labelField.setEditable(false);
        labelPane.add(labelField);
        labelPane.add(editLabelButton);
        labelPane.add(saveLabelButton);
        labelPane.add(deleteLabelButton);

        // J'ajoute la possibilité de scroller la fenêtre et je place le texte et le
        // panel des boutons
        this.add(createToolBar(), BorderLayout.NORTH);
        this.add(new JScrollPane(notePane), BorderLayout.CENTER);
        this.add(labelPane, BorderLayout.SOUTH);

    }

    private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();

        toolBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        toolBar.setBackground(new Color(206, 222, 242));

        ReadButton = new JButton("Fichier");
        ReadButton.setFont(new Font("Arial", Font.BOLD, 18));
        ReadButton.setBackground(new Color(206, 222, 242));
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

        labelBox = createLabelBox();
        labelBox.setFont(new Font("Arial", Font.BOLD, 16));
        labelBox.setBackground(new Color(255, 255, 255));
        labelBox.setPreferredSize(new Dimension(200, 30));
        labelBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                itemLabel = labelBox.getSelectedItem().toString();
                labelField.setText(itemLabel);
                editLabelButton.setVisible(true);
                deleteLabelButton.setVisible(true);

                // bouton d'édition
                editLabelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        labelField.setEditable(true);
                        saveLabelButton.setVisible(true);
                        editLabelButton.setVisible(false);
                    }
                });

                saveLabelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        saveLabelButton.setVisible(false);
                        editLabelButton.setVisible(true);
                        labelField.setEditable(false);
                        labelClass.editLabel(itemLabel);
                    }
                });

                deleteLabelButton.addActionListener(evt -> {
                    int option = JOptionPane.showConfirmDialog(null,
                            "Êtes-vous sûr de vouloir supprimer le label \"" + itemLabel + "\" ?",
                            "Confirmation de suppression", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        labelClass.deleteLabel(itemLabel);
                    }
                });
            }
        });
        newLabelField = new JTextField();
        newLabelField.setVisible(false);
        newLabelField.setColumns(20);

        saveNewLabel = new JButton("Save Label");
        saveNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
        saveNewLabel.setBackground(new Color(206, 222, 242));
        saveNewLabel.setPreferredSize(new Dimension(150, 30));
        saveNewLabel.setVisible(false);
        saveNewLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // ouvre la boîte à couleur
                newLabelField.setVisible(false);
                addNewLabel.setVisible(true);
                saveNewLabel.setVisible(false);
                String newItem = newLabelField.getText();
                labelClass.newLabel(newItem);
            }
        });

        addNewLabel = new JButton("New Label");
        addNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
        addNewLabel.setBackground(new Color(206, 222, 242));
        addNewLabel.setPreferredSize(new Dimension(150, 30));
        addNewLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // ouvre la boîte à couleur
                newLabelField.setVisible(true);
                saveNewLabel.setVisible(true);
                addNewLabel.setVisible(false);
            }
        });

        toolBar.add(ReadButton);
        toolBar.add(fontBox);
        toolBar.add(sizeBox);
        toolBar.add(boldButton);
        toolBar.add(italicButton);
        toolBar.add(colorButton);
        toolBar.add(labelBox);
        toolBar.add(addNewLabel);
        toolBar.add(saveNewLabel);
        toolBar.add(newLabelField);

        return toolBar;
    }

    public JComboBox createLabelBox() {
        return labelClass.createLabelBox();
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
