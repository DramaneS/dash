/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Apprenant;
import com.example.demo.repositories.apprenantRepositories;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dramane.diarra
 */
@Service
public class apprenantServiceImp implements apprenantServices{

    @Autowired
    apprenantRepositories apprenantRepositories;
    @Override
    public Apprenant ajouter_apprenant(Apprenant apprenant) {
        return apprenantRepositories.save(apprenant); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Apprenant modifier_apprenant(Long id, Apprenant apprenant) {
Apprenant APP = apprenantRepositories.findById(id).get();
        APP.setPrenom(apprenant.getPrenom());
        APP.setNom(apprenant.getNom());
        APP.setEmail(apprenant.getEmail());
        APP.setEmail(apprenant.getEmail());
        APP.setGenre(apprenant.getGenre());
        APP.setPassword(apprenant.getPassword());
        APP.setTel(apprenant.getTel());
        return apprenantRepositories.save(APP);        
    }

    @Override
    public List<Apprenant> liste_apprenant() {
        return apprenantRepositories.findAll();
    }

    @Override
    public Apprenant afficher_apprenant_by_id(Long id) {
       return apprenantRepositories.findById(id).get();
    }

    @Override
    public void supprimer_apprenant(Long id) {
        apprenantRepositories.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

}
