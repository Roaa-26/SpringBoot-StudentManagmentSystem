package com.studentmanagmentsystem.DTO;

import com.studentmanagmentsystem.Entity.Assignment;
import com.studentmanagmentsystem.Entity.Course;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class AssignmentDTO {

    private int id;

    private String description;

    private Date due_date;

    private int course_id;

    public AssignmentDTO() {

    }
    public AssignmentDTO(Assignment assignment) {
        this.id=assignment.getId();
        this.description= assignment.getDescription();
        this.due_date=assignment.getDue_date();
        this.course_id= assignment.getCourse().getId();
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

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
}
