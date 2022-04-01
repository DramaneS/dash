package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.Apprenant;

import java.util.List;
import java.util.Optional;

public interface ApprenantService {
    public Apprenant ajouter_apprenant(Apprenant apprenant);
    public Apprenant modifier_apprenant(Long id, Apprenant apprenant);
    public List<Apprenant> liste_apprenant();
    public Apprenant afficher_apprenant_by_id(Long id);
    void supprimer_apprenant(Long id);
}
