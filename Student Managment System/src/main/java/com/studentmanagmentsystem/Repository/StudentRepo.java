package com.studentmanagmentsystem.Repository;

import com.studentmanagmentsystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
