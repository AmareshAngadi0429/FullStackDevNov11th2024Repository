package com.gentech.inventory.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "inv_table")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invId;
    @Column(name = "p_name")
    private String pName;
    @Column(name = "p_quantity")
    private int pQuantity;
    @Column(name = "price")
    private double price;

    public Inventory(String pName, int pQuantity, double price) {
        this.pName = pName;
        this.pQuantity = pQuantity;
        this.price = price;
    }

    public Inventory() {
    }

    public int getInvId() {
        return invId;
    }

    public void setInvId(int invId) {
        this.invId = invId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
