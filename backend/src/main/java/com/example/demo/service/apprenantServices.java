/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Apprenant;
import java.util.List;

/**
 *
 * @author dramane.diarra
 */
public interface apprenantServices {
    public Apprenant ajouter_apprenant(Apprenant apprenant);
    public Apprenant modifier_apprenant(Long id, Apprenant apprenant);
    public List<Apprenant> liste_apprenant();
    public Apprenant afficher_apprenant_by_id(Long id);
    void supprimer_apprenant(Long id);
}
