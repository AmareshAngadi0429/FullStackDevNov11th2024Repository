package com.gentech.university.dtolayer;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UniversityDto {
    private int id;


    private String name;

    private Date doe;

    private String chairman;

    private String viceChairman;

    private String address;

    private long contactNo;

    private String eMail;



    public UniversityDto(String name, int id, String chairman, String viceChairman, String address, long contactNo, String eMail) {
        this.name = name;
        this.id = id;
        this.chairman = chairman;
        this.viceChairman = viceChairman;
        this.address = address;
        this.contactNo = contactNo;
        this.eMail = eMail;
    }



}
