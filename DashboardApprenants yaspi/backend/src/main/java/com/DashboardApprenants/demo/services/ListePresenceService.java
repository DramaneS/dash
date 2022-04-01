package com.DashboardApprenants.demo.services;


import com.DashboardApprenants.demo.model.ListePresence;

public interface ListePresenceService {
    public ListePresence afficher_presence_by_apprenant(Long id);
    public ListePresence afficher_liste_prensence_by_jour(Long id);
    public ListePresence afficher_liste_prensence_by_semaine(Long id);
    public ListePresence afficher_liste_prensence_by_mois(Long id);
    public ListePresence afficher_liste_prensence_by_interval(Long id);

}
