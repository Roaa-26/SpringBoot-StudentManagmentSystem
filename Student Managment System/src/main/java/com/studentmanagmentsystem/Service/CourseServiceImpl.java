package com.studentmanagmentsystem.Service;

import com.studentmanagmentsystem.Entity.Course;
import com.studentmanagmentsystem.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    private CourseRepo courseRepo;

    @Autowired
    public CourseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public Course findById(int id) {

        Optional<Course> result=courseRepo.findById(id);
        Course course=null;
        if(result.isPresent()){
             course=result.get();

        }
        return course;
    }
}
