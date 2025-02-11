package com.gentech.abstractDemo;
abstract class Parent5
{
    String animalName;
    int lifeSpan;

    void showName()
    {
        System.out.println("Animal Name : "+animalName);
    }
    abstract void showLifeSpan();
}
class Base5 extends Parent5
{

    @Override
    void showLifeSpan() {
        System.out.println("LifeSpan : "+lifeSpan);
    }
}
public class AbstractClsContainsInstanceVariblesAndMethods {
    public static void main(String[] args) {
        Base5 b = new Base5();
        b.animalName = "Dog";
        b.lifeSpan = 15;
        b.showName();
        b.showLifeSpan();
    }
}
