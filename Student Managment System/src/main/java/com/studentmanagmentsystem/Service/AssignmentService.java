package com.studentmanagmentsystem.Service;

import com.studentmanagmentsystem.Entity.Assignment;

import java.util.Collection;
import java.util.List;

public interface AssignmentService {

    public void save(Assignment assignment);
    public Assignment findById(int id);

    List<Assignment> findAll();
}
