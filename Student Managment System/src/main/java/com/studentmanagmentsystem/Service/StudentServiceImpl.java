package com.studentmanagmentsystem.Service;


import com.studentmanagmentsystem.Entity.Course;
import com.studentmanagmentsystem.Entity.Student;
import com.studentmanagmentsystem.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepo studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student findById(int id) {

        Optional<Student> result = studentRepo.findById(id);
        Student student = null;
        if (result.isPresent()) {
            student = result.get();

        }
        return student;
    }
}
