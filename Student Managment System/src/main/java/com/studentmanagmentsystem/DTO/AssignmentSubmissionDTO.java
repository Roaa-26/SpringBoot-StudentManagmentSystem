package com.studentmanagmentsystem.DTO;

import com.studentmanagmentsystem.Entity.Assignment;
import com.studentmanagmentsystem.Entity.AssignmentSubmission;
import com.studentmanagmentsystem.Entity.Student;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class AssignmentSubmissionDTO {

    private int id;

    private Date submission_date;

    private String content;

    private float mark;

    private int assignment_id;


    private int student_id;

    public AssignmentSubmissionDTO() {
    }
    public AssignmentSubmissionDTO(AssignmentSubmission assignmentSubmission){
        this.id=assignmentSubmission.getId();
        this.content=assignmentSubmission.getContent();
        this.mark=assignmentSubmission.getMark();
        this.submission_date=assignmentSubmission.getSubmission_date();
        this.student_id=assignmentSubmission.getStudent().getId();
        this.assignment_id=assignmentSubmission.getAssignment().getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSubmission_date() {
        return submission_date;
    }

    public void setSubmission_date(Date submission_date) {
        this.submission_date = submission_date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public int getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(int assignment_id) {
        this.assignment_id = assignment_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}
