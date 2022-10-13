package com.studentmanagmentsystem.Service;

import com.studentmanagmentsystem.Entity.Assignment;
import com.studentmanagmentsystem.Entity.AssignmentSubmission;
import com.studentmanagmentsystem.Repository.AssignmentSubmissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentSubmissionServiceImpl implements AssignmentSubmissionService{

    private AssignmentSubmissionRepo assignmentSubmissionRepo;

    @Autowired
    public AssignmentSubmissionServiceImpl(AssignmentSubmissionRepo assignmentSubmissionRepo) {
        this.assignmentSubmissionRepo = assignmentSubmissionRepo;
    }

    @Override
    public void save(AssignmentSubmission assignment) {
        assignmentSubmissionRepo.save(assignment);
    }
}
