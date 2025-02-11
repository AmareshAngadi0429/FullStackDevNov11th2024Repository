package com.gentech.springbootassignment1.demo.bean;

public class College {
    private int cId;
    private String cName;
    private String doe;
    private String address;

    public College() {
    }

    public College(int cId, String cName, String doe, String address) {
        this.cId = cId;
        this.cName = cName;
        this.doe = doe;
        this.address = address;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
