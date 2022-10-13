package com.studentmanagmentsystem.Controller;

import com.studentmanagmentsystem.Repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    private TeacherRepo teacherRepo;

    @Autowired
    public TeacherController(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }
}
