package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.Apprenant;
import com.DashboardApprenants.demo.repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ApprenantServiceimpl implements ApprenantService{

    @Autowired
    ApprenantRepository apprenantRepository;
    @Override
    public Apprenant ajouter_apprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    @Override
    public Apprenant modifier_apprenant(Long id, Apprenant apprenant) {
        Apprenant apprenantExistant = apprenantRepository.findById(id).get();
        apprenantExistant.setNom(apprenant.getNom());
        apprenantExistant.setPrenom(apprenant.getPrenom());
        apprenantExistant.setGenre(apprenant.getGenre());
        apprenantExistant.setEmail(apprenant.getEmail());
        apprenantExistant.setPassword(apprenant.getPassword());
        return apprenantRepository.save(apprenantExistant);
    }

    @Override
    public List<Apprenant> liste_apprenant() {
        return apprenantRepository.findAll();
    }

    @Override
    public Apprenant afficher_apprenant_by_id(Long id) {
        return apprenantRepository.findById(id).get();
    }


    @Override
    public void supprimer_apprenant(Long id) {
        apprenantRepository.deleteById(id);
    }
}
