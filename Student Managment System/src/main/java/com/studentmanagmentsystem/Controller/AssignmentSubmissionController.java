package com.studentmanagmentsystem.Controller;

import com.studentmanagmentsystem.DTO.AssignmentSubmissionDTO;
import com.studentmanagmentsystem.Facade.AssignmentSubmissionFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentSubmissionController {

    private AssignmentSubmissionFacade assignmentSubmissionFacade;

    @Autowired
    public AssignmentSubmissionController(AssignmentSubmissionFacade assignmentSubmissionFacade) {
        this.assignmentSubmissionFacade = assignmentSubmissionFacade;
    }
    @PostMapping("/assignmentSubmissions")
    public AssignmentSubmissionDTO addAssignmentSubmission(@RequestBody AssignmentSubmissionDTO assignmentSubmissionDTO) {
        assignmentSubmissionFacade.add(assignmentSubmissionDTO);
        return assignmentSubmissionDTO;
    }
}
