package com.gentech.student.dto;

public class StudentDto {
    private int stdId;
    private  String stdName;
    private  String courseName;

    public StudentDto() {
    }


    public StudentDto(String stdName, String courseName) {
        this.stdName = stdName;
        this.courseName = courseName;
    }

    public StudentDto(int stdId, String stdName, String courseName) {
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
