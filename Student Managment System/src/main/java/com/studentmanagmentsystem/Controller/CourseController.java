package com.studentmanagmentsystem.Controller;

import com.studentmanagmentsystem.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private CourseRepo courseRepo;

    @Autowired
    public CourseController(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }
}
