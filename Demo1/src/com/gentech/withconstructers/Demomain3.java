package com.gentech.withconstructers;

class Product
{
	int pId;
	String pName;
	String manfDate;
	String expiryDate;
	double price;
	Product()
	{
		pId=01;
		pName="Rice";
		price=4000.00;
		manfDate="12-11-2024";
		expiryDate="12-12-2-24";
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
	String Pname;
	int ordQnty;
	int totalPrice;
	String payMtd;
	Order()
	{
		ordId=91;
		Pname="Locker";
		ordQnty=110;
		totalPrice=10001;
		payMtd="Offline";
		System.out.println("ordId: "+ordId);
		System.out.println("Pname: "+Pname );
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
	Shipping()
	{
		shipId=11;
		ordId=23;
		address="Balleri";
		contactNo ="9900860380";
		deliveryDate ="12-1-2024";
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

		Product pr = new Product();
		
		Order ord = new Order();
		
		Shipping ship = new Shipping();
		

	}

}
