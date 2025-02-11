package com.gentech.student.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stdId;
    @Column(name = "std_name")
    private  String stdName;
    @Column(name="course_name")
    private  String courseName;

    public StudentEntity() {
    }

    public StudentEntity(String stdName, String courseName) {
        this.stdName = stdName;
        this.courseName = courseName;
    }

    public StudentEntity(int stdId, String stdName, String courseName) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.courseName = courseName;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
