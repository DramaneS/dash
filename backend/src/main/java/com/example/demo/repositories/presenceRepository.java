/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repositories;

import com.example.demo.model.presence;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dramane.diarra
 */
public interface presenceRepository extends JpaRepository<presence, Long>{
    //Requete prepare ( jpql )
    public List<presence> getPresenceListByDate(LocalDate localDate);
    public List<presence> getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(LocalDate min, LocalDate max);
}
