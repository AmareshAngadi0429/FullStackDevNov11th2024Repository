package com.gentech.university.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl_university")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "u_name")
    private String name;

    @CreationTimestamp
    @Column(name = "u_doe")
    private Date doe;

    @Column(name = "u_chairman")
    private String chairman;

    @Column(name = "u_vice_chairman")
    private String viceChairman;

    @Column(name = "u_address")
    private String address;

    @Column(name = "u_contact_no")
    private long contactNo;

    @Column(name = "u_email")
    private String eMail;

    public University(String address, String name, String chairman, String viceChairman, long contactNo, String eMail) {
        this.address = address;
        this.name = name;
        this.chairman = chairman;
        this.viceChairman = viceChairman;
        this.contactNo = contactNo;
        this.eMail = eMail;
    }
}
