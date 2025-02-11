package com.gentech.parameterisedconstructors;

class Sales
{
    int saleid;
    String product;
    int quantitySold;
    String saleDate;
    double totalPrice;
    Sales(int saleid,String product,int quantitySold,String saleDate,double totalPrice)
    {
        this.saleid =saleid;
        this.product=product;
        this.quantitySold=quantitySold;
        this.saleDate=saleDate;
        this.totalPrice=totalPrice;
        System.out.println("saleId: "+saleid);
        System.out.println("productName: "+product);
        System.out.println("quantitySold: "+quantitySold);
        System.out.println("saleDate: "+saleDate);
        System.out.println("totalPrice: "+totalPrice);
        System.out.println("----------------------------------------------");
    }
}

class Purchase
{
    int pId;
    String custName;
    String productName;
    String purchaseDate;
    int totalPrice;
    Purchase(int pId, String custName,String productName,String purchaseDate,int totalPrice)
    {
        this.pId=pId;
        this.custName=custName;
        this.productName=productName;
        this.purchaseDate=purchaseDate;
        this.totalPrice = totalPrice;
        System.out.println("pId: "+pId);
        System.out.println("custName: "+custName);
        System.out.println("productName: "+productName);
        System.out.println("purchaseDate: "+purchaseDate);
        System.out.println("totalPrice: "+totalPrice);
        System.out.println("----------------------------------------------");
    }

}

class Inventory
{
    int itemId;
    String itemName;
    int inStock;
    int reOrderByCust;
    String feedBack;
    Inventory(int itemId,String itemName,int inStock,int reOrderByCust,String feedBack)
    {
        this.itemId = itemId;
        this.itemName =itemName;
        this.inStock =inStock;
        this.reOrderByCust = reOrderByCust;
        this.feedBack =feedBack;
        System.out.println("itemId: "+itemId);
        System.out.println("itemName: "+itemName);
        System.out.println("inStock: "+inStock);
        System.out.println("reOrderByCust: "+ reOrderByCust);
        System.out.println("feedBack: "+feedBack);
        System.out.println("-------------------------------------------------");
    }
}
public class Demomain2 {
    public static void main(String[] args) {
        Sales s =new Sales(12,"pen",10,"12-12-2024",300.55);
        Purchase p = new Purchase(11,"Vasu","Pen","12-12-2024",200);
        Inventory i= new Inventory(14,"Pen",200,400,"Good Product");
    }

}
