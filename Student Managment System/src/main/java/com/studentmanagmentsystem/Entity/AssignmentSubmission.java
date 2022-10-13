package com.studentmanagmentsystem.Entity;


import com.studentmanagmentsystem.DTO.AssignmentSubmissionDTO;
import com.studentmanagmentsystem.DTO.CourseAttendanceDTO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "assignment_submission")
public class AssignmentSubmission {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "submission_date")
    private Date submission_date;

    @Column(name = "content_submitted")
    private String content;

    @Column(name = "mark")
    private float mark;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="assignment_id")
    private Assignment assignment;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="student_id")
    private Student student;

    public AssignmentSubmission() {

    }

    public AssignmentSubmission(int student_id, Date submission_date, String content, float mark) {
//        this.student_id = student_id;
//        this.assignment_id = assignment_id;
        this.submission_date = submission_date;
        this.content = content;
        this.mark = mark;
    }

    public AssignmentSubmission(AssignmentSubmissionDTO assignmentSubmissionDTO) {
        this.id=assignmentSubmissionDTO.getId();
        this.mark=assignmentSubmissionDTO.getMark();
        this.content=assignmentSubmissionDTO.getContent();
        this.submission_date=assignmentSubmissionDTO.getSubmission_date();
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

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    @Override
    public String toString() {
        return "AssignmentSubmission{" +
                "id=" + id +
                ", submission_date=" + submission_date +
                ", content='" + content + '\'' +
                ", mark=" + mark +
                ", assignment=" + assignment +
                ", student=" + student +
                '}';
    }
}
