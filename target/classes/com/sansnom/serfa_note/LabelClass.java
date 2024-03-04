/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author psylo
 */
public class LabelClass extends JPanel{
    
    JTextField labelField;
    JTextField labelAdded;
    
    JPanel labelPane;
    JPanel addButtonPane;
    
    JButton editButton;
    JButton saveLabelButton;
    JButton deleteButton;
    JButton addButton;
    JButton saveNewLabel;
    
    ArrayList<String> listLabels;
    
    String labelText;
    String newLabel;
    String contentAdded;

    
    public LabelClass(){
        
       
     
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        listLabels = new ArrayList<>(); 
        listLabels.add("Tests");
        listLabels.add("Editeur de texte");
        listLabels.add("Fais chier");
        
        for (int i = 0; i < listLabels.size(); i++) {
          
            labelText = listLabels.get(i);
            int indexLabel = i;

            labelField = new JTextField(labelText);
            labelField.setEditable(false);
            editButton = new JButton("Modifier");
            editButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    labelField.setEditable(true);
                    saveLabelButton.setVisible(true);
                    editButton.setVisible(false);
                }
            });
            saveLabelButton = new JButton("Enregistrer");
            saveLabelButton.setVisible(false);
            saveLabelButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    labelField.setEditable(false);
                    newLabel = labelField.getText();
                    listLabels.set(indexLabel, newLabel);
                    saveLabelButton.setVisible(false);
                    editButton.setVisible(true);
                    System.out.println(listLabels.get(indexLabel));
                }
            });
            deleteButton = new JButton("Supprimer");
            

            labelPane = new JPanel(new FlowLayout(FlowLayout.LEFT));
            labelField.setColumns(20);
            labelField.setBorder(null);
            labelPane.add(labelField);
            labelPane.add(editButton);
            labelPane.add(saveLabelButton);
            labelPane.add(deleteButton);
            labelPane.add(Box.createRigidArea(new Dimension(0, 5)));
            this.add(labelPane);
          
          
            final JPanel finalLabelPane = labelPane;
            deleteButton.addActionListener(e -> {
                int option = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir supprimer le label \""  + listLabels.get(indexLabel) + "\" ?", "Confirmation de suppression", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        listLabels.remove(indexLabel);
                        finalLabelPane.removeAll();
                        finalLabelPane.revalidate(); // J'actualise le layout après suppression
                        finalLabelPane.repaint(); // Je redessine le JPanel après suppression
                    }
            });
            
            
        }
        
        addButtonPane = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        labelAdded = new JTextField();
        labelAdded.setVisible(false);
        labelAdded.setColumns(50);
        addButton = new JButton("Ajouter");
        saveNewLabel = new JButton("Sauvegarder");
        saveNewLabel.setVisible(false);
        
        addButton.addActionListener(e -> {
                        labelAdded.setVisible(true);
                        saveNewLabel.setVisible(true);
                        addButton.setVisible(false);            
            });
        
        saveNewLabel.addActionListener(e -> {
                        labelAdded.setVisible(false);
                        addButton.setVisible(true);
                        saveNewLabel.setVisible(false);
                        contentAdded = labelAdded.getText();
                        listLabels.add(contentAdded);
                        saveLabelButton.setVisible(false);
                        //Je retire  tous les composants du JPanel finalLabelPane
                       
            });
        
        addButtonPane.add(labelAdded);
        addButtonPane.add(addButton);
        addButtonPane.add(saveNewLabel);
        this.add(addButtonPane);
          
    }
}
