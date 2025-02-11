package com.gentech.test4;
class Order
{
    void showNetPrice()
    {
        System.out.println("Net price of order ");
    }
}
class OrderItems extends Order
{
    OrderItems()
    {
        super.showNetPrice();
    }
    void showNetPrice()
    {
        System.out.println("Orderitems net price");
    }
}
class Invoice extends OrderItems
{
    Invoice()
    {
        super.showNetPrice();
    }
    void showNetPrice()
    {
        System.out.println("invoice net price");
    }
}
public class Test41 {
    public static void main(String[] args) {
        Invoice i = new Invoice();
        i.showNetPrice();
    }
}
