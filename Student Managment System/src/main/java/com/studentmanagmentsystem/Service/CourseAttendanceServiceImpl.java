package com.studentmanagmentsystem.Service;

import com.studentmanagmentsystem.Entity.CourseAttendance;
import com.studentmanagmentsystem.Repository.CourseAttendanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseAttendanceServiceImpl implements CourseAttendanceService{

    private CourseAttendanceRepo courseAttendanceRepo;

    @Autowired
    public CourseAttendanceServiceImpl(CourseAttendanceRepo courseAttendanceRepo) {
        this.courseAttendanceRepo = courseAttendanceRepo;
    }

    @Override
    public void save(CourseAttendance courseAttendance) {
        courseAttendanceRepo.save(courseAttendance);
    }
}
