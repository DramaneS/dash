package com.DashboardApprenants.demo.controllers;
import com.DashboardApprenants.demo.services.AdminService;
import com.DashboardApprenants.demo.services.ApprenantService;
import com.DashboardApprenants.demo.services.ListePresenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("/DashboardApprenants")
public class Controller {
    @Autowired
    AdminService adminService;
    @Autowired
    ApprenantService apprenantService;
    @Autowired
    ListePresenceService listePresenceService;
}
