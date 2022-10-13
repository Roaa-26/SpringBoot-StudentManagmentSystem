package com.studentmanagmentsystem.Repository;

import com.studentmanagmentsystem.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
