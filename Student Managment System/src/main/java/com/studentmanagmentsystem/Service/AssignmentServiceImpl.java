package com.studentmanagmentsystem.Service;

import com.studentmanagmentsystem.Entity.Assignment;
import com.studentmanagmentsystem.Repository.AssignmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignmentServiceImpl implements AssignmentService{

    private AssignmentRepo assignmentRepo;

    @Autowired
    public AssignmentServiceImpl(AssignmentRepo assignmentRepo) {
        this.assignmentRepo = assignmentRepo;
    }

    @Override
    public void save(Assignment assignment) {
        assignmentRepo.save(assignment);
    }

    @Override
    public Assignment findById(int id) {

        Optional<Assignment> result=assignmentRepo.findById(id);
        Assignment assignment=null;
        if(result.isPresent()){
            assignment=result.get();

        }
        return assignment;
    }
    @Override
    public List<Assignment> findAll() {
        return assignmentRepo.findAll();
    }
}
