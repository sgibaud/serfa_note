/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note.Data;

/**
 *
 * @author DevInfo
 */
public class Label {
    private int id;
    private String libelle;
    
    public Label(int id, String libelle){
        this.id = id;
        this.libelle = libelle;
    }
    
    public String getLabel(){
     return this.libelle;
    }
    
}
