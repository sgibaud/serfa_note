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
    

    private LabelClass labels;
    private JPanel labelBoxPanel;
    private JPanel labelPanel;
    
    
    private JLabel test;
    private JPanel modalPanel;
   
     
    public JModalLabel(JFrame frame, String titre, boolean modal) {
        
        super(frame, titre, modal);
        
        labels = new LabelClass();

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
    
    public void displayLabelBox(){
        labels = new LabelClass();
        labelBoxPanel = new JPanel();
  
        labelBoxPanel = labels.createLabelBox();
        this.setTitle("Ajouter un label à ajouter :");
        this.setContentPane(labelBoxPanel);
        
    }
    
    
}
