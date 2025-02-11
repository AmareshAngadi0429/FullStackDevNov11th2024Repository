package com.gentech.saless.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sales_dept")
public class Sales {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saleId;
   @Column(name = "productName")
    private String productName;
   @Column(name = "quantitySold")
    private int quantitySold;
   @Column(name = "totalPrice")
    private double totalPrice;

    public Sales() {
    }

    public Sales(String productName, int quantitySold, double totalPrice) {

        this.productName = productName;
        this.quantitySold = quantitySold;
        this.totalPrice = totalPrice;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
