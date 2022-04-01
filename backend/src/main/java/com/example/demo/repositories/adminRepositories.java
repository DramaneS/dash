/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repositories;

import com.example.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dramane.diarra
 */
public interface adminRepositories extends JpaRepository <Admin, Long>{
    
}
