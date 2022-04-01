package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.Admin;
import com.DashboardApprenants.demo.repositories.AdminRepository;

import java.util.List;
import java.util.Optional;


public interface AdminService {
    public Admin ajouter_admin(Admin admin);
    public Admin modifier_admin(Long id, Admin admin);
    public List<Admin> liste_admin();
    public Admin afficher_admin_by_id(Long id);
    void supprimer_admin(Long id);
   // public Optional<Admin> loginUser(String login, String password);


}
