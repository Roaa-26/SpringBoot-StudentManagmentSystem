package com.studentmanagmentsystem.Facade;

import com.studentmanagmentsystem.DTO.CourseAttendanceDTO;

import java.util.List;

public interface CourseAttendanceFacade {
    void add(CourseAttendanceDTO courseAttendanceDTO);

    void addAll(List<CourseAttendanceDTO> courseAttendanceDTOs);
}
