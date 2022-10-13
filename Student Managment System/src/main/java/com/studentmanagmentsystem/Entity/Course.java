package com.studentmanagmentsystem.Entity;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "course" ,cascade =CascadeType.ALL)
    @JsonIgnore
    private List<Assignment> assignmentList;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="teacher_id")
    private Teacher teacher;

    @OneToMany(mappedBy = "course" ,cascade =CascadeType.ALL)
    @JsonIgnore
    private List<CourseAttendance> courseAttendances;

    @ManyToMany(fetch=FetchType.LAZY,
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name="course_student",
            joinColumns=@JoinColumn(name="course_id"),
            inverseJoinColumns=@JoinColumn(name="student_id")
    )
    @JsonIgnore
    private List<Student> students;

    public Course() {
    }

    public Course(String name) {
        this.name = name;
//        this.teacher_id = teacher_id;
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


    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }



    public void addAssignment(Assignment assignment){

        if(assignmentList==null){
            assignmentList=new ArrayList<>();

        }
        assignmentList.add(assignment);

        assignment.setCourse(this);

    }
    public void addCourseAttendance(CourseAttendance courseAttendance){

        if(courseAttendances==null){
            courseAttendances=new ArrayList<>();

        }
        courseAttendances.add(courseAttendance);

        courseAttendance.setCourse(this);

    }

    public List<CourseAttendance> getCourseAttendances() {
        return courseAttendances;
    }

    public void setCourseAttendances(List<CourseAttendance> courseAttendances) {
        this.courseAttendances = courseAttendances;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){

        if(students==null){
            students=new ArrayList<>();

        }
        students.add(student);

//        student.ad(this);

    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assignmentList=" + assignmentList +
                ", teacher=" + teacher +
                ", courseAttendances=" + courseAttendances +
                ", students=" + students +
                '}';
    }
}
