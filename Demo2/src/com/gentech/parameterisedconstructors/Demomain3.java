package com.gentech.parameterisedconstructors;

class Product
{
    int pId;
    String pName;
    String manfDate;
    String expiryDate;
    double price;
    Product(int pId,String pName,double price,String manfDate,String expiryDate)
    {
        this.pId=pId;
        this.pName=pName;
        this.price=price;
        this.manfDate=manfDate;
        this.expiryDate=expiryDate;
        System.out.println("pId: "+pId);
        System.out.println("pName: "+pName);
        System.out.println("price: "+price);
        System.out.println("manfDate: "+manfDate);
        System.out.println("expiryDate: "+expiryDate);
        System.out.println("-----------------------------------------------");
    }
}

class Order
{
    int ordId;
    String pName;
    int ordQnty;
    double totalPrice;
    String payMtd;
    Order(int ordId,String pName,int ordQnty,double totalPrice,String payMtd)
    {
        this.ordId=ordId;
        this.pName=pName;
        this.ordQnty=ordQnty;
        this.totalPrice=totalPrice;
        this.payMtd=payMtd;
        System.out.println("ordId: "+ordId);
        System.out.println("Pname: "+pName );
        System.out.println("ordQnty: "+ordQnty);
        System.out.println("totalPrice: "+totalPrice);
        System.out.println("patMtd: "+payMtd);
        System.out.println("------------------------------------------------");
    }
}

class Shipping
{
    int shipId;
    int ordId;
    String address;
    String deliveryDate;
    String contactNo;
    Shipping(int shipId,int ordId,String address,String deliveryDate,String contactNo)
    {
        this.shipId=shipId;
        this.ordId=ordId;
        this.address=address;
        this.contactNo =contactNo;
        this.deliveryDate =deliveryDate;
        System.out.println("shipId: "+shipId);
        System.out.println("ordId: "+ordId);
        System.out.println("address: "+address);
        System.out.println("cotactNo: "+contactNo);
        System.out.println("deliveryDate: "+deliveryDate);
        System.out.println("---------------------------------------------------");
    }
}


public class Demomain3 {
    public static void main(String[] args) {
        Product p = new Product(1,"purse",250.00,"12-12-2023","12-12-2028");
        Order o= new Order(21,"purse",3,999,"Offline");
        Shipping s = new Shipping(3,1,"Mysore","12-12-2024","7789937778");
    }
}
