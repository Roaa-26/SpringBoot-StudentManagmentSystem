package com.studentmanagmentsystem.Facade;

import com.studentmanagmentsystem.DTO.AssignmentDTO;

import java.util.List;

public interface AssignmentFacade {

    public void add(AssignmentDTO assignmentDTO);

    List<AssignmentDTO> findAll();
}
