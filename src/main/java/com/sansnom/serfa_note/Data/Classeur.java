/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note.Data;

/**
 *
 * @author DevInfo
 */
public class Classeur {
    private int id;
    private String libelle;
    private String couleur;
    
    public Classeur(int id,String libelle, String couleur){
    this.couleur= couleur;
    this.id = id;
    this.libelle = libelle;
    }
    
    public int getId(){
    return this.id;
    }   
    
    public String getLib(){
    return this.libelle;
    }    
    
    public String getCol(){
    return "#"+this.couleur;
    }    
}
