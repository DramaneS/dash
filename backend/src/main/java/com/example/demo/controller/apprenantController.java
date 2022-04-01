/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Apprenant;
import com.example.demo.service.apprenantServices;
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
@CrossOrigin
@RequestMapping("/apprenant")
@RestController

public class apprenantController {
    @Autowired
	public apprenantServices apprenantService;
    
	@PostMapping(value="/ajout_apprenant")
	public Apprenant ajouter_apprenant(@RequestBody Apprenant apprenant) {
		return apprenantService.ajouter_apprenant(apprenant);
	}

	@PutMapping(value=("/update_apprenant/{id}"))
	public Apprenant update(@PathVariable("id") Long id, @RequestBody Apprenant apprenant ) {
		
		return apprenantService.modifier_apprenant(id, apprenant);
	}

	@GetMapping(value="/liste_apprenant")
	public List<Apprenant> listeApprenant(){
		return apprenantService.liste_apprenant();
	}
	@GetMapping(value="/apprenant/{id}")
	public Apprenant apprenantById(@PathVariable("id") Long id) {
		return apprenantService.afficher_apprenant_by_id(id);
	}
	@DeleteMapping(value="/delete_apprenant/{id}")
	public void delete(@PathVariable("id") Long id) {
		apprenantService.supprimer_apprenant(id);
		
	}
	/*
        @GetMapping(value="/rechercherApprenant/login={login}&password={password}")
	public Optional<Apprenant> rechercher(@PathVariable("login") String login,@PathVariable("password") String password){
		return apprenantService.rechercher(login, password);
		
	}
        */
    
}
