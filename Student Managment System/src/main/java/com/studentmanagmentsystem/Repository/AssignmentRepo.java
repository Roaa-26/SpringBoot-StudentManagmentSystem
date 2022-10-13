package com.studentmanagmentsystem.Repository;

import com.studentmanagmentsystem.Entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepo extends JpaRepository<Assignment,Integer> {
}
