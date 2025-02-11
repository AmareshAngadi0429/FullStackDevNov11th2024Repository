package com.gentech.withoutconstructers;

class Product
{
	int pId;
	String pName;
	String manfDate;
	String expiryDate;
	double price;
}

class Order
{
	int ordId;
	String Pname;
	int ordQnty;
	int totalPrice;
	String payMtd;
}

class Shipping
{
	int shipId;
	int ordId;
	String address;
	String deliveryDate;
	String contactNo;
}

public class DemoMain3 {

	public static void main(String[] args) {

		Product pr = new Product();
		pr.pId=07;
		pr.pName="Biscut";
		pr.price=40.00;
		pr.manfDate="12-11-2024";
		pr.expiryDate="12-12-2-24";
		System.out.println("pId: "+pr.pId);
		System.out.println("pName: "+pr.pName);
		System.out.println("price: "+pr.price);
		System.out.println("manfDate: "+pr.manfDate);
		System.out.println("expiryDate: "+pr.expiryDate);
		System.out.println("-----------------------------------------------");
		
		Order ord = new Order();
		ord.ordId=12;
		ord.Pname="Pen";
		ord.ordQnty=10;
		ord.totalPrice=100;
		ord.payMtd="Online";
		System.out.println("ordId: "+ord.ordId);
		System.out.println("Pname: "+ord.Pname );
		System.out.println("ordQnty: "+ord.ordQnty);
		System.out.println("totalPrice: "+ord.totalPrice);
		System.out.println("patMtd: "+ord.payMtd);
		System.out.println("------------------------------------------------");
		
		Shipping ship = new Shipping();
		ship.shipId=11;
		ship.ordId=23;
		ship.address="Bengaluru";
		ship.contactNo ="112364324";
		ship.deliveryDate ="12-1-2024";
		System.out.println("shipId: "+ship.shipId);
		System.out.println("ordId: "+ship.ordId);
		System.out.println("address: "+ship.address);
		System.out.println("cotactNo: "+ship.contactNo);
		System.out.println("deliveryDate: "+ship.deliveryDate);
		System.out.println("---------------------------------------------------");

	}

}
