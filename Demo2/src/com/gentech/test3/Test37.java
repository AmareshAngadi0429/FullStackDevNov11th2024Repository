package com.gentech.test3;
class Tes71
{
    {
        System.out.println("this is a instance block");
    }
    static
    {
        System.out.println("thos is a static block");
    }
}
class Tes72
{
   Tes72(int x)
    {
        Tes71 t = new Tes71();
        System.out.println("x : "+x);
    }
}
public class Test37 {
    public static void main(String[] args) {
        Tes72 t = new Tes72(3);
    }
}
