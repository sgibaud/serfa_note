/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note;

import java.awt.Color;

/**
 *
 * @author draconic
 */
public class Nuancier {

    public Color[] colors; // Tableau de couleurs

    public Nuancier() {
        // Initialisation des 12 couleurs
        colors = new Color[]{
            new Color(255, 0, 0), // Rouge
            new Color(0, 255, 0), // Vert
            new Color(0, 0, 255), // Bleu
            new Color(255, 255, 0), // Jaune
            new Color(255, 165, 0), // Orange
            new Color(128, 0, 128), // Violet
            new Color(255, 69, 0), // Rouge-orangé
            new Color(0, 128, 128), // Bleu-vert
            new Color(255, 255, 0), // Jaune-orangé
            new Color(0, 255, 255), // Cyan
            new Color(255, 0, 255), // Magenta
            new Color(128, 128, 128) // Gris
        };
    }
    
    public Color[] getColors() {
        return colors;
    }

    public Color selectionCouleur(int index) {
        if (index >= 0 && index < colors.length) {
            return colors[index];
        } else {
            return Color.BLACK; // Couleur par défaut en cas d'index invalide
        }
    }
}
