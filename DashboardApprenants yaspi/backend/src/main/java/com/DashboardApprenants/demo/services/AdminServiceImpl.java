package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.Admin;
import com.DashboardApprenants.demo.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminRepository adminRepository;
    @Override
    public Admin ajouter_admin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin modifier_admin(Long id, Admin admin) {
        Admin adminFound = adminRepository.findById(id).get();
        adminFound.setNom(admin.getNom());
        adminFound.setPrenom(admin.getPrenom());
        adminFound.setPassword(admin.getPassword());
        adminFound.setLogin(admin.getLogin());
        return adminRepository.save(adminFound);
    }

    @Override
    public List<Admin> liste_admin() {
        return adminRepository.findAll();
    }

    @Override
    public Admin afficher_admin_by_id(Long id) {
        return adminRepository.findById(id).get();
    }

    @Override
    public void supprimer_admin(Long id) {
        adminRepository.deleteById(id);
    }
}
