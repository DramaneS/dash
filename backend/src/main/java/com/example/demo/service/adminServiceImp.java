/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Admin;
import com.example.demo.repositories.adminRepositories;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dramane.diarra
 */
@Service
public class adminServiceImp implements adminServices{
    @Autowired
    private adminRepositories adminRepositories;
    
    @Override
    public Admin ajouter_admin(Admin admin) {
        return adminRepositories.save(admin);
    }

    @Override
    public List<Admin> liste_admin() {
        return adminRepositories.findAll();
    }

    @Override
    public Admin modifier_admin(Long id_admin, Admin adminis) {
        Admin admin = adminRepositories.findById(id_admin).get();
        admin.setId(adminis.getId());
        admin.setNom(adminis.getNom());
        admin.setPrenom(adminis.getPrenom());
        admin.setTel(adminis.getTel());
        admin.setEmail(adminis.getEmail());
        admin.setGenre(adminis.getGenre());
        return adminRepositories.save(admin);
    }

    @Override
    public Admin afficher_admin_by_id(Long id_admin) {
        return adminRepositories.findById(id_admin).get(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimer_admin(Long id_admin) {
       adminRepositories.deleteById(id_admin); //To change body of generated methods, choose Tools | Templates.
    }

}
