package com.studentmanagmentsystem.Entity;


import com.studentmanagmentsystem.DTO.CourseAttendanceDTO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "course_attendance")
public class CourseAttendance {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "attendance_date")
    private Date attendanceDate;

    @Column(name = "status")
    private String status;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="course_id")
    private Course course;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="student_id")
    private Student student;

    public CourseAttendance() {
    }

    public CourseAttendance( Date attendanceDate, String status) {
        this.attendanceDate = attendanceDate;
        this.status = status;
    }

    public CourseAttendance(CourseAttendanceDTO courseAttendanceDTO) {
        this.attendanceDate=courseAttendanceDTO.getAttendanceDate();
        this.status= courseAttendanceDTO.getStatus();
        this.id=courseAttendanceDTO.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "CourseAttendance{" +
                "id=" + id +
                ", attendanceDate=" + attendanceDate +
                ", status='" + status + '\'' +
                ", course=" + course +
                ", student=" + student +
                '}';
    }
}
