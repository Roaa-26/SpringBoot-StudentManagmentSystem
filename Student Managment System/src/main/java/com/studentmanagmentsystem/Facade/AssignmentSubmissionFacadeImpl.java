package com.studentmanagmentsystem.Facade;

import com.studentmanagmentsystem.DTO.AssignmentSubmissionDTO;
import com.studentmanagmentsystem.Entity.Assignment;
import com.studentmanagmentsystem.Entity.AssignmentSubmission;
import com.studentmanagmentsystem.Entity.Student;
import com.studentmanagmentsystem.Service.AssignmentService;
import com.studentmanagmentsystem.Service.AssignmentSubmissionService;
import com.studentmanagmentsystem.Service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class AssignmentSubmissionFacadeImpl implements AssignmentSubmissionFacade{

    private AssignmentSubmissionService assignmentSubmissionService;
    private StudentService studentService;
    private AssignmentService assignmentService;

    public AssignmentSubmissionFacadeImpl(AssignmentSubmissionService assignmentSubmissionService, StudentService studentService, AssignmentService assignmentService) {
        this.assignmentSubmissionService = assignmentSubmissionService;
        this.studentService = studentService;
        this.assignmentService = assignmentService;
    }

    @Override
    public void add(AssignmentSubmissionDTO assignmentSubmissionDTO) {
        Assignment assignment=assignmentService.findById(assignmentSubmissionDTO.getAssignment_id());
        Student student=studentService.findById(assignmentSubmissionDTO.getStudent_id());
        AssignmentSubmission assignmentSubmission=new AssignmentSubmission(assignmentSubmissionDTO);
        assignmentSubmission.setAssignment(assignment);
        assignmentSubmission.setStudent(student);
        assignmentSubmission.setId(0);
        assignmentSubmissionService.save(assignmentSubmission);
        assignmentSubmissionDTO.setId(assignmentSubmission.getId());



    }
}
