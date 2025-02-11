package com.gentech.withoutconstructers;

class Sales
{
	int saleid;
	String product;
	int quantitySold;
	String saleDate;
	double totalPrice;
}

class Purchase
{
	int pId;
	String custName;
	String productName;
	String purchaseDate;
	int totalPrice;
	
}

class Inventory
{
	int itemId;
	String itemName;
	int inStock;
	int reOrderByCust;
	String feedBack;
}

public class Demomain2 {

	public static void main(String[] args) {
	
		Sales sale = new Sales();
		sale.saleid=22;
		sale.product="Trimmer";
		sale.quantitySold=390;
		sale.saleDate="12-1-2024";
		sale.totalPrice=50000.43;
		System.out.println("saleId: "+sale.saleid);
		System.out.println("productName: "+sale.product);
		System.out.println("quantitySold: "+sale.quantitySold);
		System.out.println("saleDate: "+sale.saleDate);
		System.out.println("totalPrice: "+sale.totalPrice);
		System.out.println("----------------------------------------------");
		
		Purchase p = new Purchase();
		p.pId=23;
		p.custName="Amaresh";
		p.productName="Sunglass";
		p.purchaseDate="12-4-2024";
		p.totalPrice = 399;
		System.out.println("pId: "+p.pId);
		System.out.println("custName: "+p.custName);
		System.out.println("productName: "+p.productName);
		System.out.println("purchaseDate: "+p.purchaseDate);
		System.out.println("totalPrice: "+p.totalPrice);
		System.out.println("----------------------------------------------");
		
		Inventory inv = new Inventory();
		inv.itemId = 20;
		inv.itemName ="Plates";
		inv.inStock =400;
		inv.reOrderByCust = 300;
		inv.feedBack ="Good Product";
		System.out.println("itemId: "+inv.itemId);
		System.out.println("itemName: "+inv.itemName);
		System.out.println("inStock: "+inv.inStock);
		System.out.println("reOrderByCust: "+ inv.reOrderByCust);
		System.out.println("feedBack: "+inv.feedBack);
		System.out.println("-------------------------------------------------");
	}

}
