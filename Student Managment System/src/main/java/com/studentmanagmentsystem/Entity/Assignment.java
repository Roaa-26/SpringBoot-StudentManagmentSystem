package com.studentmanagmentsystem.Entity;


import com.studentmanagmentsystem.DTO.AssignmentDTO;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "assignment")
public class Assignment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="description")
    private String description;

    @Column(name = "due_date")
    private Date due_date;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="course_id")
    private Course course;

    @JsonIgnore
    @OneToMany(mappedBy = "assignment" ,cascade =CascadeType.ALL)
    private List<AssignmentSubmission> assignmentSubmissions;


    public Assignment() {
    }

    public Assignment(String description,Date due_date) {
        this.description = description;
//        this.course_id = course_id;
        this.due_date = due_date;
    }

    public Assignment(AssignmentDTO assignmentDTO) {
//        this.id=assignmentDTO.getId();
        this.due_date=assignmentDTO.getDue_date();
        this.description=assignmentDTO.getDescription();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }





    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<AssignmentSubmission> getAssignmentSubmissions() {
        return assignmentSubmissions;
    }

    public void setAssignmentSubmissions(List<AssignmentSubmission> assignmentSubmissions) {
        this.assignmentSubmissions = assignmentSubmissions;
    }

    public void addAssignmentSubmission(AssignmentSubmission assignment){

        if(assignmentSubmissions==null){
            assignmentSubmissions=new ArrayList<>();

        }
        assignmentSubmissions.add(assignment);

        assignment.setAssignment(this);

    }

    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", due_date=" + due_date +
                ", course=" + course +
                ", assignmentSubmissions=" + assignmentSubmissions +
                '}';
    }
}
