/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note;

import com.sansnom.serfa_note.Data.Label;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author psylo
 */
public class LabelClass extends JPanel {

    private JPanel labelPanel;//panel ou le labelField est ajouté -> initLabels()
    private JLabel labelField; //champs ou les labels sont affichés dans la note -> initLabels()

    //méthode create label -> déclaration des composants
    private JPanel labelBoxPanel; //panel principal dans la modal
    private JPanel listPanel; //panel supérieur contenant la box des labels, les boutons pour tous les labels et le labelTextField
    private JPanel allLabelPanel; //panel contenant les 3 boutons NEW MOD SUPP
    private JPanel labelEditPanel;//panel contenant le labelTextField + les boutons Ajouter et Modifier + noteButtonPanel
    private JPanel displayLabelPanel;//panel contenant le labelTextField + les boutons Ajouter et Modifier
    private JPanel noteButtonPanel; //panel contenant les boutons ADD NOTE et SUPP NOTE
    private JButton newLabelButton; //bouton NEW 
    private JButton suppLabelButton; //bouton SUPP
    private JButton modifLabelButton; //bouton MOD
    private JLabelButton addNewLabelButton; //bouton ajouter
    private JLabelButton updateLabelButton; //bouton modifier
    private JButton addLabelNoteButton; // bouton ADD NOTE
    private JButton suppLabelNoteButton; // bouton SUPP NOTE
    private JTextField labelTextField;  //panel ou les labels choisis s'affichent
    private String oldLabel;
 
    private JComboBox labelBox;

    private ArrayList<Label> listLabels;

    private String labelText;
    
    private String[] labelName;
    
    public JComboBox box;
    
    private Home origin;
    private int idF;
    
    
    private ImageIcon newLabelIcon = new ImageIcon(getClass().getResource("/resources/new_note2x.png"));
    private ImageIcon editLabelIcon = new ImageIcon(getClass().getResource("/resources/doc2x.png"));
    private ImageIcon suppLabelIcon = new ImageIcon(getClass().getResource("/resources/sub_note2x.png"));
    private ImageIcon addNoteIcon = new ImageIcon(getClass().getResource("/resources/add_note2x.png"));
    private ImageIcon suppNoteIcon = new ImageIcon(getClass().getResource("/resources/remove_note2x.png"));

    public LabelClass(Home home, int id) {
        this.origin = home;
        this.idF = id;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        listLabels = new ArrayList<>();

        initLabels();

    }
    
    public void fillBox(ArrayList<Label> list){
       
    box.removeAllItems();
    System.out.println(list);
    System.out.println(box);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getLabel());
            box.addItem(list.get(i).getLabel());
        }
    System.out.println(box);
    box.revalidate();
    box.repaint();
    }
    
    public void setlistLabel(ArrayList<Label> newlist){
     this.listLabels = newlist;
     this.initLabels();
     this.revalidate();
     this.repaint();
     
    }

    public boolean cangetlabels(){
           if(this.listLabels.size()<2){return true;}
           else {return false;}
    }
    
    public boolean haslabel(int id){
        for(int i = 0;i<this.listLabels.size();i++){if(listLabels.get(i).getId() == id){return true;}}
        return false;
    }
    
    private void initLabels() {
        this.removeAll();
        labelText = new String();
        labelPanel = new JPanel();
        labelPanel.setPreferredSize(new Dimension(600, 40));
        labelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        labelPanel.setBackground(new Color(23, 106, 115));
        
        for (int i = 0; i < listLabels.size(); i++) {
            labelText = listLabels.get(i).getLabel();
            labelField = new JLabel(" - " + labelText + " - ");
            labelField.setForeground(Color.WHITE);
            labelField.setFont(new Font("Arial", Font.BOLD, 16));

            labelPanel.add(labelField);
        }
        
        
        this.add(labelPanel);
        
        /*labelBox = createLabelBox();
        labelBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Valeur: " + labelBox.getSelectedItem().toString());
            }
        });*/

    }
    
    

//Afficher les labels dans la comboBox -> SELECT All Labels ///////////////////////////////////////////////////////////////////////////////////////////
    public JPanel createAllLabelsModal(String labelType) {
        labelBoxPanel = new JPanel();
        listPanel = new JPanel();
        allLabelPanel = new JPanel();
        labelEditPanel = new JPanel();
        noteButtonPanel = new JPanel();
        displayLabelPanel = new JPanel();
        newLabelButton = new JButton();
        suppLabelButton = new JButton();
        modifLabelButton = new JButton();
        labelTextField = new JTextField();
        addNewLabelButton = new JLabelButton("Ajouter");
        updateLabelButton  = new JLabelButton("Modifier");
        addLabelNoteButton  = new JButton();
        suppLabelNoteButton  = new JButton();
        oldLabel = new String();
        
        newLabelButton.setIcon(newLabelIcon);
        modifLabelButton.setIcon(editLabelIcon);
        suppLabelButton.setIcon(suppLabelIcon);
        addLabelNoteButton.setIcon(addNoteIcon);
        suppLabelNoteButton.setIcon(suppNoteIcon);
        
        newLabelButton.setBackground(new Color(242, 242, 242,0));
        modifLabelButton.setBackground(new Color(242, 242, 242,0));
        suppLabelButton.setBackground(new Color(242, 242, 242,0));
        addLabelNoteButton.setBackground(new Color(242, 242, 242,0));
        suppLabelNoteButton.setBackground(new Color(242, 242, 242,0));
        
        newLabelButton.setPressedIcon(new ImageIcon(getClass().getResource("/resources/new_note_neg2x.png")));
        newLabelButton.setRolloverIcon(new ImageIcon(getClass().getResource("/resources/new_note_neg2x.png"))); 
        modifLabelButton.setPressedIcon(new ImageIcon(getClass().getResource("/resources/doc_neg_12x.png")));
        modifLabelButton.setRolloverIcon(new ImageIcon(getClass().getResource("/resources/doc_neg_12x.png")));
        suppLabelButton.setPressedIcon(new ImageIcon(getClass().getResource("/resources/sub_note_neg2x.png")));
        suppLabelButton.setRolloverIcon(new ImageIcon(getClass().getResource("/resources/sub_note_neg2x.png")));
        addLabelNoteButton.setPressedIcon(new ImageIcon(getClass().getResource("/resources/add_note_neg2x.png")));
        addLabelNoteButton.setRolloverIcon(new ImageIcon(getClass().getResource("/resources/add_note_neg2x.png")));
        suppLabelNoteButton.setPressedIcon(new ImageIcon(getClass().getResource("/resources/remove_note_neg2x.png")));
        suppLabelNoteButton.setRolloverIcon(new ImageIcon(getClass().getResource("/resources/remove_note_neg2x.png")));
        
        addNewLabelButton.setVisible(false);
        updateLabelButton.setVisible(false);
        labelTextField.setVisible(false);
        labelTextField.setEditable(false);
        labelTextField.setPreferredSize(new Dimension(270, 40));
        
        listPanel.setLayout(new BorderLayout());
        labelEditPanel.setLayout(new BorderLayout());
        labelBoxPanel.setBackground(new Color(23, 106, 115));
        listPanel.setBackground(new Color(23, 106, 115));
        allLabelPanel.setBackground(new Color(23, 106, 115));
        labelEditPanel.setBackground(new Color(23, 106, 115));
        noteButtonPanel.setBackground(new Color(23, 106, 115));
        displayLabelPanel.setBackground(new Color(23, 106, 115));
        
        addNewLabelButton.setPreferredSize(new Dimension(120, 40)); 
        updateLabelButton.setPreferredSize(new Dimension(120, 40)); 
        addLabelNoteButton.setPreferredSize(new Dimension(120, 40)); 
        suppLabelNoteButton.setPreferredSize(new Dimension(120, 40)); 
        
        if(labelType.equals("noteLabel")){
            noteButtonPanel.setVisible(true);
        }else {
            noteButtonPanel.setVisible(false);
        }
        
        box = new JComboBox();
        box.setBackground(Color.WHITE);
        box.setPreferredSize(new Dimension(300, 40));

        labelBoxPanel.setLayout(new FlowLayout());
        
        fillBox(origin.db.GetLabels());
        
        box.setFont(new Font("Arial", Font.BOLD, 16));
        box.setForeground(new Color(23, 106, 115));
        box.addActionListener(new ActionListener() {     
                @Override
                public void actionPerformed(ActionEvent e) {
                    labelTextField.setVisible(false);
                }
        });
      
        
        newLabelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                labelTextField.setEditable(true);
                labelTextField.setVisible(true);
                addNewLabelButton.setVisible(true);
                updateLabelButton.setVisible(false);
            }
        });
        
        addNewLabelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                labelTextField.setEditable(false);
                origin.db.PostLabel(labelTextField.getText());
                System.out.println(origin.db.GetLabels());
                origin.editor.modal.labels.fillBox(origin.db.GetLabels());
                addNewLabelButton.setVisible(false);
                JOptionPane.showMessageDialog(null,"Le label \"" + labelTextField.getText() + "\" a été enregistré.","",JOptionPane.PLAIN_MESSAGE);
                labelTextField.setVisible(false);
                labelTextField.setText("");
//Enregistrer le nouveau label labelTextField.getText(); -> INSERT //////////////////////////////////////////////////////////////////                 
            }
        });
        
        modifLabelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                labelTextField.setEditable(true);
                labelTextField.getText();
                labelTextField.setVisible(true);
                //labelTextField.setText("");
                updateLabelButton.setVisible(true);
                addNewLabelButton.setVisible(false);
                oldLabel = box.getSelectedItem().toString();
            }
        });
        
        updateLabelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                labelTextField.setEditable(false);
                origin.db.UpdateLabel(labelTextField.getText(),listLabels.get(box.getSelectedIndex()).getId());
                fillBox(origin.db.GetLabels());
                updateLabelButton.setVisible(false);
                JOptionPane.showMessageDialog(null,"Le label \"" + oldLabel + "\" a été modifié.","",JOptionPane.PLAIN_MESSAGE);
                labelTextField.setVisible(false);
                labelTextField.setText("");

//Enregistrer le nouveau label labelTextField.getText(); -> UPDATE //////////////////////////////////////////////////////////////////                 
            }
        });
        
        suppLabelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                oldLabel = box.getSelectedItem().toString();
                int option = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir supprimer le label \""  + box.getSelectedItem().toString() + "\" ?", "Confirmation de suppression", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        origin.db.DeleteLabel(listLabels.get(box.getSelectedIndex()).getId());
                        fillBox(origin.db.GetLabels());
                        listLabels.remove(box.getSelectedItem().toString());
                        JOptionPane.showMessageDialog(null,"Le label \"" + oldLabel + "\" vient d'être supprimé.","",JOptionPane.PLAIN_MESSAGE);
                    }
//Enregistrer le label choisi : box.getSelectedItem().toString(); -> DELETE //////////////////////////////////////////////////////////////////                 
            }
        });
        
        addLabelNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
                System.out.println(origin.editor.labelClass.cangetlabels());
                System.out.println(origin.editor.labelClass.haslabel(listLabels.get(box.getSelectedIndex()).getId()));
                if((origin.editor.labelClass.cangetlabels())&&!(origin.editor.labelClass.haslabel(listLabels.get(box.getSelectedIndex()).getId()))){
                    origin.db.AddLabel(listLabels.get(box.getSelectedIndex()).getId(), idF);
                    origin.editor.labelClass.setlistLabel(origin.db.GetLabels(idF));
                    labelTextField.getText();
                    labelTextField.setText("Le label \"" + labelTextField.getText() + "\" est lié à la note.");
                }
                else{
                    labelTextField.getText();
                    labelTextField.setText("Le label n'a pas pu être lié a la note.");
                }
=======
                oldLabel = box.getSelectedItem().toString();
                origin.db.AddLabel(listLabels.get(box.getSelectedIndex()).getId(), idF);
                origin.editor.labelClass.setlistLabel(origin.db.GetLabels(idF));
                labelTextField.getText();
                JOptionPane.showMessageDialog(null,"Le label \"" + oldLabel + "\" est lié à la note.","",JOptionPane.PLAIN_MESSAGE);
>>>>>>> editorV2
//Lier le label et la note labelTextField.getText(); -> INSERT idNote avec idLabel //////////////////////////////////////////////////////////////////                 
            }
        });
        
        suppLabelNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                oldLabel = box.getSelectedItem().toString();
                origin.db.RemoveLabel(listLabels.get(box.getSelectedIndex()).getId(), idF);
                origin.editor.labelClass.setlistLabel(origin.db.GetLabels(idF));
                labelTextField.getText();
                JOptionPane.showMessageDialog(null,"Le label \"" + oldLabel + "\" a été supprimé de la note.","",JOptionPane.PLAIN_MESSAGE);
//Supprimer le lien entre label et note labelTextField.getText(); -> DELETE idNote avec idLabel //////////////////////////////////////////////////////////////////                 
            }
        });
        
        noteButtonPanel.add(addLabelNoteButton);
        noteButtonPanel.add(suppLabelNoteButton);
        
        displayLabelPanel.add(labelTextField);
        displayLabelPanel.add(addNewLabelButton);
        displayLabelPanel.add(updateLabelButton);
        
        labelEditPanel.add(displayLabelPanel, BorderLayout.CENTER);
        labelEditPanel.add(noteButtonPanel, BorderLayout.SOUTH);
        
        listPanel.add(box, BorderLayout.NORTH);
        listPanel.add(allLabelPanel, BorderLayout.CENTER);
        listPanel.add(labelEditPanel, BorderLayout.SOUTH);
        
        allLabelPanel.add(newLabelButton);
        allLabelPanel.add(modifLabelButton);
        allLabelPanel.add(suppLabelButton);
        
        labelBoxPanel.add(listPanel);

        return labelBoxPanel;
    }



}