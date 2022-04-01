package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.ListePresence;
import com.DashboardApprenants.demo.repositories.ListePresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListePresenceServiceImpl implements ListePresenceService{
    @Autowired
    ListePresenceRepository listePresenceRepository;
    @Override
    public ListePresence afficher_presence_by_apprenant(Long id) {
        return listePresenceRepository.findById(id).get();
    }

    @Override
    public ListePresence afficher_liste_prensence_by_jour(Long id) {
        return null;
    }

    @Override
    public ListePresence afficher_liste_prensence_by_semaine(Long id) {
        return null;
    }

    @Override
    public ListePresence afficher_liste_prensence_by_mois(Long id) {
        return null;
    }

    @Override
    public ListePresence afficher_liste_prensence_by_interval(Long id) {
        return null;
    }
}
