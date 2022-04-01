/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dramane.diarra
 */

@Entity
@Table(name = "Admin")
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_admin;
    private String nom;
    private String prenom;
    private Long Tel;
    private String genre;
    private String email;
    private String password;
    public Admin(){
        
    }
    
    public Admin(String nom, String prenom, Long Tel, String genre, String email, String password, String fonction) {
        this.nom = nom;
        this.prenom = prenom;
        this.Tel = Tel;
        this.genre = genre;
        this.email = email;
        this.password = password;
    }
    

    public Long getId() {
        return id_admin;
    }

    public void setId(Long id_admin) {
        this.id_admin = id_admin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Long getTel() {
        return Tel;
    }

    public void setTel(Long Tel) {
        this.Tel = Tel;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
