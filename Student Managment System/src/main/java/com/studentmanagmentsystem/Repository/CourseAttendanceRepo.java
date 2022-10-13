package com.studentmanagmentsystem.Repository;

import com.studentmanagmentsystem.Entity.CourseAttendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseAttendanceRepo extends JpaRepository<CourseAttendance,Integer> {
}
