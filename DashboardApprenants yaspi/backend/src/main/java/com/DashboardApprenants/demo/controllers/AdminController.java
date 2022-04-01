package com.DashboardApprenants.demo.controllers;

import com.DashboardApprenants.demo.model.Admin;
import com.DashboardApprenants.demo.model.Apprenant;
import com.DashboardApprenants.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin/DashboardApprenants/")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping(value="/apprenant")
    public Admin save(@RequestBody Admin admin) {
        return adminService.ajouter_admin(admin);
    }

    @GetMapping(path = "/apprenant/{id}")
    public Admin getOne (@PathVariable Long id){
        return adminService.afficher_admin_by_id(id);
    }

    @GetMapping(path="/ListeApprenants", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Admin> liste(){
        return adminService.liste_admin();
    }

    @PutMapping(path = "/apprenant/{id}")
    public Admin update(@RequestBody Admin admin, @PathVariable Long id){
        return adminService.modifier_admin(id, admin);
    }

    @DeleteMapping(value="/apprenant/{id}")
    public void delete(@PathVariable("id") Long id) {
        adminService.supprimer_admin(id);
    }
}
