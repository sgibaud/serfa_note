/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author psylo
 */
public class JLabelButton extends JButton {
    
    public JLabelButton(String Title){
        this.setText(Title);
        this.setBackground(Color.WHITE);
        this.setFont(new Font("Arial", Font.BOLD, 16));
        this.setForeground(new Color(23, 106, 115));
        this.setPreferredSize(new Dimension(75, 50));
    }
    
}
