package com.gentech.test3;
class Tes51
{
    {
        System.out.println("this is 1st instance block");
    }
    {
        System.out.println("this is a 2nd instance block");
    }
    {
        System.out.println("thus is a 3rd instance block");
    }
}
public class Test35 {
    public static void main(String[] args) {
        Tes51 t = new Tes51();
    }
}
