/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.presence;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author dramane.diarra
 */
public interface presenceServices {  
   //Add to an user to presence list
    public void addPresence(presence listPresence);

    //Get all presence list
    public List<presence> getAPresenceList();

    //Get presence list by date
    public List<presence> getPresenceList(LocalDate localDate);

    //Get presence list by week
    public List<presence> getPresenceList(int year, int month, int day);

    //Get presence list by month
    public List<presence> getPresenceList(int year, int month);

    //Get presence list between two periodes of time
    public List<presence> getPresenceList(LocalDate min, LocalDate max);
}
