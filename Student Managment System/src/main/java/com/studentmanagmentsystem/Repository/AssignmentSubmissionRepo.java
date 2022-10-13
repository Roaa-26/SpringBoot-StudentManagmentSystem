package com.studentmanagmentsystem.Repository;

import com.studentmanagmentsystem.Entity.AssignmentSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentSubmissionRepo extends JpaRepository<AssignmentSubmission,Integer> {
}
