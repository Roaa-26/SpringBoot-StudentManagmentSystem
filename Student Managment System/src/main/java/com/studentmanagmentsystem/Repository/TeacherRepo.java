package com.studentmanagmentsystem.Repository;

import com.studentmanagmentsystem.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
