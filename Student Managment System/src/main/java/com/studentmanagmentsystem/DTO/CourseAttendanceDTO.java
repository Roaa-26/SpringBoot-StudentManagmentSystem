package com.studentmanagmentsystem.DTO;

import com.studentmanagmentsystem.Entity.CourseAttendance;

import java.util.Date;

public class CourseAttendanceDTO {

    private int id;

    private Date attendanceDate;

    private String status;

    private int course_id;


    private int student_id;

    public CourseAttendanceDTO() {
    }
    public CourseAttendanceDTO(CourseAttendance courseAttendance){
        this.id=courseAttendance.getId();
        this.attendanceDate=courseAttendance.getAttendanceDate();
        this.course_id=courseAttendance.getCourse().getId();
        this.status=courseAttendance.getStatus();
        this.student_id=courseAttendance.getStudent().getId();
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

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}
