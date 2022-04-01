/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dramane.diarra
 */
@Entity
public class presence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Temporal(TemporalType.DATE)
    Date date;
    @Temporal(TemporalType.TIME)
    @JsonFormat(pattern = "HH:mn")
    Date heure_arriver;
    @Temporal(TemporalType.TIME)
    @JsonFormat(pattern = "HH:mn")
    Date heure_depart;
    @ManyToOne
    private Apprenant apprenants;
    @ManyToOne
    private Admin admin;

    public presence() {
    }
    

    public presence(Date date, Date heure_arriver, Date heure_depart, Apprenant apprenants, Admin admin) {
        this.date = date;
        this.heure_arriver = heure_arriver;
        this.heure_depart = heure_depart;
        this.apprenants = apprenants;
        this.admin = admin;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHeure_arriver() {
        return heure_arriver;
    }

    public void setHeure_arriver(Date heure_arriver) {
        this.heure_arriver = heure_arriver;
    }

    public Date getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(Date heure_depart) {
        this.heure_depart = heure_depart;
    }

    public Apprenant getApprenants() {
        return apprenants;
    }

    public void setApprenants(Apprenant apprenants) {
        this.apprenants = apprenants;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
}
