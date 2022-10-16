package com.studentmanagmentsystem.Facade;

import com.studentmanagmentsystem.DTO.CourseAttendanceDTO;
import com.studentmanagmentsystem.Entity.*;
import com.studentmanagmentsystem.Service.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseAttendanceFacadeImpl implements CourseAttendanceFacade{

    private CourseAttendanceService courseAttendanceService;
    private StudentService studentService;
    private CourseService courseService;

    public CourseAttendanceFacadeImpl(CourseAttendanceService courseAttendanceService, StudentService studentService, CourseService courseService) {
        this.courseAttendanceService = courseAttendanceService;
        this.studentService = studentService;
        this.courseService = courseService;
    }

    @Override
    public void add(CourseAttendanceDTO courseAttendanceDTO) {
        Course course=courseService.findById(courseAttendanceDTO.getCourse_id());
        Student student=studentService.findById(courseAttendanceDTO.getStudent_id());
        if(student.getCourses().contains(course)){
            CourseAttendance courseAttendance = new CourseAttendance(courseAttendanceDTO);
            courseAttendance.setCourse(course);
            courseAttendance.setStudent(student);
            courseAttendance.setId(0);
            courseAttendanceService.save(courseAttendance);
            courseAttendanceDTO.setId(courseAttendance.getId());
        }

    }

    @Override
    public void addAll(List<CourseAttendanceDTO> courseAttendanceDTOs) {
        for (int i=0;i<courseAttendanceDTOs.size();i++){
            this.add(courseAttendanceDTOs.get(i));
        }
    }
}
