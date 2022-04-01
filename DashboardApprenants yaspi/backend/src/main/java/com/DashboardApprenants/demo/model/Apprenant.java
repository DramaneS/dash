package com.DashboardApprenants.demo.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Apprenant{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String genre;
    @Enumerated(EnumType.STRING)
    private TypeUtilisateur typeUtilisateur;
    @ManyToOne
    private Admin id_admin;
    @OneToMany(mappedBy = "apprenants")
    private Collection<ListePresence> listePresence;

    public Apprenant() {
    }

    public Long getId() {
        return id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public TypeUtilisateur getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

    public Admin getId_admin() {
        return id_admin;
    }

    public void setId_admin(Admin id_admin) {
        this.id_admin = id_admin;
    }

    public Collection<ListePresence> getListePresence() {
        return listePresence;
    }

    public void setListePresence(Collection<ListePresence> listePresence) {
        this.listePresence = listePresence;
    }
}
