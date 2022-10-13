package com.studentmanagmentsystem.Controller;


import com.studentmanagmentsystem.DTO.AssignmentDTO;
import com.studentmanagmentsystem.Facade.AssignmentFacade;
import com.studentmanagmentsystem.Facade.AssignmentFacadeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssignmentController {

   private AssignmentFacade assignmentFacade;

    @Autowired
    public AssignmentController(AssignmentFacade assignmentFacade) {
        this.assignmentFacade = assignmentFacade;
    }

    @GetMapping("/assignments")
    public List<AssignmentDTO> viewAllAssignments() {
        return assignmentFacade.findAll();
    }
    @PostMapping("/assignments")
    public AssignmentDTO addAssignment(@RequestBody AssignmentDTO assignmentDTO) {
        assignmentFacade.add(assignmentDTO);
        return assignmentDTO;
    }
}
