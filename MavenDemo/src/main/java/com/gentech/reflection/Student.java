package com.gentech.reflection;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollNo;
    private String firstName;
    private String courseName;

    public Student(int rollno, String firstName, String courseName)
    {
        this.rollNo=rollno;
        this.firstName=firstName;
        this.courseName=courseName;
    }

    public void showRollNo()
    {
        System.out.println("RollNo of the Student:"+rollNo);
    }

    public void showFirstName()
    {
        System.out.println("First Name of the Student:"+firstName);
    }

    public void showCourseName()
    {
        System.out.println("Course Name of the Student:"+courseName);
    }
}
