package com.studentmanagmentsystem.Facade;


import com.studentmanagmentsystem.DTO.AssignmentDTO;
import com.studentmanagmentsystem.Entity.Assignment;
import com.studentmanagmentsystem.Entity.Course;
import com.studentmanagmentsystem.Service.AssignmentService;
import com.studentmanagmentsystem.Service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssignmentFacadeImpl implements AssignmentFacade{

    private AssignmentService assignmentService;
    private CourseService courseService;

    public AssignmentFacadeImpl(AssignmentService assignmentService, CourseService courseService) {
        this.assignmentService = assignmentService;
        this.courseService = courseService;
    }

    public void add(AssignmentDTO assignmentDTO) {
        Course course=courseService.findById(assignmentDTO.getCourse_id());
        Assignment assignment=new Assignment(assignmentDTO);
        assignment.setCourse(course);
        assignment.setId(0);
        assignmentService.save(assignment);
        assignmentDTO.setId(assignment.getId());
    }

    @Override
    public List<AssignmentDTO> findAll() {
        return assignmentService.findAll().stream().map(AssignmentDTO::new)
                .collect(Collectors.toList());
    }
}

