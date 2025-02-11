package com.gentech.springbootassignment1.demo.bean;

public class Employee {
    private int eId;
    private String eName;
    private int age;
    private String address;

    public Employee() {

    }

    public Employee(int eId, String eName, int age, String address) {
        this.eName = eName;
        this.eId = eId;
        this.age = age;
        this.address = address;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
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
}
