package com.gentech.abstractDemo;
abstract class Parent4
{
    Parent4(String name,String surName)
    {
        System.out.println("FirstName : "+ name);
        System.out.println("SurName : "+ surName);
    }
    Parent4(int age,String address )
    {
        System.out.println("Age : "+ age);
        System.out.println("Address : "+ address);
    }
    Parent4(int pinCode,int contact)
    {
        System.out.println("Pincode : "+ pinCode);
        System.out.println("Contact : "+ contact);
    }
}
class Base4 extends Parent4
{
    Base4(String name,String surName)
    {
        super(name,surName);
    }
    Base4(int age,String address)
    {
        super(age,address);
    }
    Base4(int pinCode , int contact)
    {
        super(pinCode,contact);
    }
}
public class AbstractClassContainsOverloadedConstructer {
    public static void main(String[] args) {
        Base4 b = new Base4("Amaresh","Angadi");
        Base4 b2 = new Base4(23,"Raichur");
        Base4 b3 = new Base4(584128,78999377);

    }
}
