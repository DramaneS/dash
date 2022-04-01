/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.presence;
import com.example.demo.service.presenceServices;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dramane.diarra
 */
@RestController
@CrossOrigin
@RequestMapping("/presence")
public class presenceController {
    
    @Autowired
	private presenceServices presenceService;
     @PostMapping("/add")
    public String addPrence(@RequestBody presence listPresence){
        this.presenceService.addPresence(listPresence);
        return "Présence cohée avec succèss...";
    }

    //Get all presence list
    @GetMapping("/all")
    public List<presence> getAllPresenceList(){
        return this.presenceService.getAPresenceList();
    }

    //Get presence list by date
    @GetMapping("/date/date={date}")
    public List<presence> getTodayPresenceList(
            @PathVariable("date") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate date){
        return this.presenceService.getPresenceList(date);
    }

    //Get presence list by a week
    @GetMapping("/week/week={year}-{month}-{day}")
    public List<presence> getListByWeek(
            @PathVariable("year") int year,
            @PathVariable("month") int month,
            @PathVariable("day") int day
    ){
        return this.presenceService.getPresenceList(year, month, day);
    }

    //Get presence list by month
    @GetMapping("/month/month={year}-{month}")
    public List<presence> getMonthPresenceList(
            @PathVariable("year") int year,
            @PathVariable("month") int month)
    {
        return this.presenceService.getPresenceList(year, month);
    }

    //Get presence list between two periodes of time
    @GetMapping("/entre/{start}&{end}")
    public List<presence> getPresenceListBetween(
            @PathVariable("start") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate start,
            @PathVariable("end") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate end){
        return this.presenceService.getPresenceList(start, end);
    }
    
}
