package com.gentech.abstractDemo;
abstract class Parent2
{
    {
        System.out.println("this is a alone instance block in abstract class InstanceAlone" );
    }
}
class Base2 extends Parent2
{

    {
        System.out.println("this is a alone instance block in class base2");
    }
}
public class InstanceBlockAlone {
    public static void main(String[] args) {
        Base2 p = new Base2();
    }
}
