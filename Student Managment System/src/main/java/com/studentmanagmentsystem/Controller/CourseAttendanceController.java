package com.studentmanagmentsystem.Controller;

import com.studentmanagmentsystem.DTO.CourseAttendanceDTO;
import com.studentmanagmentsystem.Facade.CourseAttendanceFacade;
import com.studentmanagmentsystem.Service.CourseAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseAttendanceController {

    private CourseAttendanceFacade courseAttendanceFacade;

    @Autowired
    public CourseAttendanceController(CourseAttendanceFacade CourseAttendanceFacade) {
        this.courseAttendanceFacade = CourseAttendanceFacade;
    }

    @PostMapping("/courseAttendances")
    public CourseAttendanceDTO addCourseAttendance(@RequestBody CourseAttendanceDTO courseAttendanceDTO) {
        courseAttendanceFacade.add(courseAttendanceDTO);
        return courseAttendanceDTO;
    }

    @PostMapping("/courseAttendances/submitAll")
    public List<CourseAttendanceDTO> submitStudentsAttendance(@RequestBody List<CourseAttendanceDTO> courseAttendanceDTOs) {

        courseAttendanceFacade.addAll(
                courseAttendanceDTOs
        );

        return courseAttendanceDTOs;
    }
}
