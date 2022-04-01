/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.presence;
import com.example.demo.repositories.presenceRepository;
import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dramane.diarra
 */
@Service
public class presenceServiceImp implements presenceServices{
    //injection de dependance presence repository
    @Autowired
    presenceRepository presenceRepository;
//ajouter la liste de presence
    @Override
    public void addPresence(presence listPresence) {
        this.presenceRepository.save(listPresence);
    }
//Afficher toute la liste de presence
    @Override
    public List<presence> getAPresenceList() {
                return this.presenceRepository.findAll();
    }
//Afficher la liste de presence par jour ( date )
    @Override
    public List<presence> getPresenceList(LocalDate localDate) {
                return this.presenceRepository.getPresenceListByDate(localDate);
    }
//Afficher la liste de presence par semaine
    @Override
    public List<presence> getPresenceList(int year, int month, int day) {
         LocalDate week = LocalDate.of(year, month, day);
        LocalDate monday = week.with(previousOrSame(DayOfWeek.MONDAY));
        LocalDate friday = week.with(nextOrSame(DayOfWeek.FRIDAY));
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(monday, friday);
    }
//Afficher la liste de presence par mois
    @Override
    public List<presence> getPresenceList(int year, int month) {
         LocalDate initial = LocalDate.of(year, month, 1);
        LocalDate start = initial.withDayOfMonth(1);
        LocalDate end = initial.withDayOfMonth(initial.lengthOfMonth());
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(start, end);
    }
//afficher la liste de presence sur un intervalle donnée
    @Override
    public List<presence> getPresenceList(LocalDate min, LocalDate max) {
                return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(min, max);
    }
    
}
