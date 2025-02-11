package com.gentech.abstractDemo;

abstract class Parent6
{
    abstract void startCar();

}
abstract class SubClassOfParent6 extends Parent6
{
    abstract void pressHorn();
    void applyBrake()
    {
        System.out.println("Apply Brake : Brake Applied");
    }
}
class Base6 extends SubClassOfParent6
{

    @Override
    void pressHorn() {
        System.out.println("Horn Please : Car Horned");
    }

    @Override
    void startCar() {
        System.out.println("Start car : Car Started");
    }
}

public class SuperClassAsAbstractClassInMultiLevelInheritance {
    public static void main(String[] args) {
        Base6 b = new Base6();
        b.startCar();
        b.pressHorn();
        b.applyBrake();

    }
}
