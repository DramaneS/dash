package com.DashboardApprenants.demo.repositories;

import com.DashboardApprenants.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository <Admin, Long> {
}
