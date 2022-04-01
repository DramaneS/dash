/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.service.adminServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dramane.diarra
 */
@RestController
@CrossOrigin
@RequestMapping("/admin")
public class adminController {
    @Autowired
    adminServices adminService;
    
    @PostMapping(path = "/ajout_admin")
    public Admin ajout(@RequestBody Admin admin){
        return adminService.ajouter_admin(admin);
    }
    
    @PutMapping(value=("/update_admin/{id}"))
    public Admin modifier(@PathVariable("id") Long id_admin, @RequestBody Admin admin ) {
	return adminService.modifier_admin(id_admin, admin);
		
    }
    
        @PutMapping(value=("/admin/{id}"))
    public Admin liste(@PathVariable("id") Long id_admin, @RequestBody Admin admin ) {
	return adminService.modifier_admin(id_admin, admin);
		
    }
    @GetMapping(value="/admin/{id}")
	public Admin apprenantById(@PathVariable("id") Long id_admin) {
		return adminService.afficher_admin_by_id(id_admin);
	}
    
    @GetMapping(value="/liste_admin")
	public List<Admin> listeAdministrateur(){
		return adminService.liste_admin();
		
		
	}

	@DeleteMapping(value="/delete_admin/{id}")
	public void delete(@PathVariable("id") Long id_admin) {
		adminService.supprimer_admin(id_admin);
		
	}
}
