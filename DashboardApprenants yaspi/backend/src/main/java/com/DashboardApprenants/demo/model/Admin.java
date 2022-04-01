package com.DashboardApprenants.demo.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    @OneToMany(mappedBy = "id_admin")
    private Collection<ListePresence> listePresences;
    @OneToMany(mappedBy = "id_admin")
    private Collection<Apprenant> apprenants;

    public Admin() {
    }

    public Long getId() {
        return id;
    }

    public Collection<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(Collection<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<ListePresence> getListePresences() {
        return listePresences;
    }

    public void setListePresences(Collection<ListePresence> listePresences) {
        this.listePresences = listePresences;
    }

}