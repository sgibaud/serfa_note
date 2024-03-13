/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author psylo
 */

public class JModalLabel extends JDialog {
    

    public LabelClass labels;
    private JPanel labelBoxPanel;
    private JPanel allLabelPanel;
    private JPanel labelNotePanel;
    private JPanel labelPanel;
    
    private JLabel test;
    private JPanel modalPanel;
   
     
    public JModalLabel(JFrame frame, String titre, boolean modal, Home home, int id){
        
        super(frame, titre, modal);
        
        labels = new LabelClass(home, id);
        labels.setlistLabel(home.db.GetLabels());

        modalPanel = new JPanel();
        modalPanel.setBackground(Color.WHITE);
        test = new JLabel();
        test.setText("Hello world !");
        modalPanel.add(test);
        this.add(modalPanel);
        
        this.setSize(600,350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(false);
    }
    
    
    public void displayLabelBox(String labelType, Home home, int id){
        labels = new LabelClass(home,id);
        labels.setlistLabel(home.db.GetLabels());
        labelBoxPanel = new JPanel();
  
        labelBoxPanel = labels.createAllLabelsModal(labelType);
        
        labelBoxPanel.setBackground(new Color(23, 106, 115));
        if(labelType.equals("noteLabel")){
            this.setTitle("Possibilité de tag 1 ou 2 fois la note :");
        }else {
            this.setTitle("Nouveau Tag :");
        }

        
        this.setContentPane(labelBoxPanel);
        
    }
    
    
}
