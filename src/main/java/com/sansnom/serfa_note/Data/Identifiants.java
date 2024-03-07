/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sansnom.serfa_note.Data;

/**
 *
 * @author DevInfo
 */
public class Identifiants {
    private String id;
    private String pswd;
    
    public Identifiants(){
    this.id = "sylvain";
    this.pswd = "SG@draconic";
    }
    
    public String getId(){
        return this.id;
    }
    public String getPswd(){
        return this.pswd;
    }
}
