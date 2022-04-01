package com.DashboardApprenants.demo.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class ListePresence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Temporal(TemporalType.DATE)
    Date date;
    @Temporal(TemporalType.TIME)
    Date heure_arriver;
    @Temporal(TemporalType.TIME)
    Date heure_depart;
    @ManyToOne
    private Apprenant apprenants;
    @ManyToOne
    private Admin id_admin;

    public ListePresence() {
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

    public Admin getId_admin() {
        return id_admin;
    }

    public void setId_admin(Admin id_admin) {
        this.id_admin = id_admin;
    }
}
