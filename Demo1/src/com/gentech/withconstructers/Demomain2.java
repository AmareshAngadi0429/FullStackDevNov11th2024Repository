package com.gentech.withconstructers;

class Sales
{
	int saleid;
	String product;
	int quantitySold;
	String saleDate;
	double totalPrice;
	Sales()
	{
		saleid =12;
		product="Shoes";
		quantitySold=990;
		saleDate="12-1-2024";
		totalPrice=50000.43;
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
	Purchase()
	{
		pId=21;
		custName="Yash";
		productName="Pant";
		purchaseDate="12-4-2024";
		totalPrice = 799;
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
	Inventory()
	{
		itemId = 20;
		itemName ="Gloves";
		inStock =4000;
		reOrderByCust = 9400;
		feedBack ="Excellent Product";
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
	
		Sales sale = new Sales();
		
		Purchase p = new Purchase();
		
		Inventory inv = new Inventory();
		
	}

}

