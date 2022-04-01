package com.DashboardApprenants.demo.controllers;

import com.DashboardApprenants.demo.model.Apprenant;
import com.DashboardApprenants.demo.services.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/DashboardApprenants/")
public class ApprenantController {

    @Autowired
    ApprenantService apprenantService;

    @PostMapping(value="/apprenant")
    public Apprenant save(@RequestBody Apprenant apprenant) {
        return apprenantService.ajouter_apprenant(apprenant);
    }

    @GetMapping(path = "/apprenant/{id}")
    public Apprenant getOne (@PathVariable Long id){
        return apprenantService.afficher_apprenant_by_id(id);
    }

    @GetMapping(path="/ListeApprenants", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Apprenant> liste(){
        return apprenantService.liste_apprenant();
    }

    @PutMapping(path = "/apprenant/{id}")
    public Apprenant update(@RequestBody Apprenant apprenant, @PathVariable Long id){
        return apprenantService.modifier_apprenant(id, apprenant);
    }

    @DeleteMapping(value="/apprenant/{id}")
    public void delete(@PathVariable("id") Long id) {
        apprenantService.supprimer_apprenant(id);
    }
}
