package com.studentmanagmentsystem.Repository;

import com.studentmanagmentsystem.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer> {
}
