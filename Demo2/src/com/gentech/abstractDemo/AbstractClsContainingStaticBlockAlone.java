package com.gentech.abstractDemo;
abstract class Parent1
{
    static
    {
        System.out.println("this is a alone static block in abstract class Static Alone" );
    }
}
class Base1 extends Parent1
{
    static
    {
        System.out.println("this is a alone static block in class base1");
    }
}
public class AbstractClsContainingStaticBlockAlone {
    public static void main(String[] args) {
        Base1 b = new Base1();
    }
}
