/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Admin;
import java.util.List;

/**
 *
 * @author dramane.diarra
 */
public interface adminServices {
    public Admin ajouter_admin(Admin admin);
    public Admin modifier_admin(Long id_admin, Admin admin);
    public List<Admin> liste_admin();
    public Admin afficher_admin_by_id(Long id_admin);
    void supprimer_admin(Long id_admin);   
}
