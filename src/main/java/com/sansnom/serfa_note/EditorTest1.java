/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sansnom.serfa_note;
import javax.swing.*;

/**
 *
 * @author psylo
 */
public class EditorTest1 {

    public static void main(String[] args) {
        //JFrame fenetre = new EditorPane();
        SwingUtilities.invokeLater(() -> {
            new EditorPane();//.setVisible(true);
            });
    };
}
