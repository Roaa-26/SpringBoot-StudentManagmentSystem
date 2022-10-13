package com.studentmanagmentsystem.Entity;


import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "age")
    int age;

    @Column(name = "address")
    private String address;

    @Column(name = "gender")
    private String gender;


    @OneToMany(mappedBy = "student" ,cascade =CascadeType.ALL)
    @JsonIgnore
    private List<AssignmentSubmission> assignmentSubmissions;

    @OneToMany(mappedBy = "student" ,cascade =CascadeType.ALL)
    @JsonIgnore
    private List<CourseAttendance> courseAttendances;

    @ManyToMany(fetch=FetchType.LAZY,
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name="course_student",
            joinColumns=@JoinColumn(name="student_id"),
            inverseJoinColumns=@JoinColumn(name="course_id")
    )
    @JsonIgnore
    private List<Course> courses;

    public Student() {
    }

    public Student(String name, String email, String mobileNumber, int age, String address, String gender) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<AssignmentSubmission> getAssignmentSubmissions() {
        return assignmentSubmissions;
    }

    public void setAssignmentSubmissions(List<AssignmentSubmission> assignmentSubmissions) {
        this.assignmentSubmissions = assignmentSubmissions;
    }

    public List<CourseAttendance> getCourseAttendances() {
        return courseAttendances;
    }

    public void setCourseAttendances(List<CourseAttendance> courseAttendances) {
        this.courseAttendances = courseAttendances;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addAssignmentSubmission(AssignmentSubmission assignment){

        if(assignmentSubmissions==null){
            assignmentSubmissions=new ArrayList<>();

        }
        assignmentSubmissions.add(assignment);

        assignment.setStudent(this);

    }

    public void addCourseAttendance(CourseAttendance courseAttendance){

        if(courseAttendances==null){
            courseAttendances=new ArrayList<>();

        }
        courseAttendances.add(courseAttendance);

        courseAttendance.setStudent(this);

    }

    public void addCourse(Course course){

        if(courses==null){
            courses=new ArrayList<>();

        }
        courses.add(course);

//        course.setStudent(this);

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", assignmentSubmissions=" + assignmentSubmissions +
                ", courseAttendances=" + courseAttendances +
                ", courses=" + courses +
                '}';
    }
}
