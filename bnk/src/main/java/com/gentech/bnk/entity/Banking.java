package com.gentech.bnk.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="tbl_banking")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Banking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "account_holder_name")
    private String accountHolderName;
    @Column(name = "account_number")
    private Long accountNumber;
    @Column(name = "balance")
    private double balance;

}
