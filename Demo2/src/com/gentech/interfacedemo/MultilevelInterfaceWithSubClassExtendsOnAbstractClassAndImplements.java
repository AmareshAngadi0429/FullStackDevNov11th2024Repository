package com.gentech.interfacedemo;
interface SpeedBtw1To30
{
    void switchGearTo1();
}
interface SpeedBtw30To60
{
    void switchGearTo2();
}
interface SpeedBtw60to80
{
    void switchGearTo3();
}
interface SpeedAbove80
{
    void switchGearTo4();
}


abstract class Reverse
{
    abstract void takeReverse();
}


class AutomateCarGear extends Reverse implements SpeedBtw1To30,SpeedBtw30To60,SpeedBtw60to80,SpeedAbove80
{

    @Override
    void takeReverse() {
        System.out.println("Change gear to reverse");
    }

    @Override
    public void switchGearTo4() {
        System.out.println("Change gear to 4 ");
    }

    @Override
    public void switchGearTo1() {
        System.out.println("Change gear to 1 ");
    }

    @Override
    public void switchGearTo2() {
        System.out.println("Change gear to 2");
    }

    @Override
    public void switchGearTo3() {
        System.out.println("Change gear to 3");
    }
}
public class MultilevelInterfaceWithSubClassExtendsOnAbstractClassAndImplements {
    public static void main(String[] args) {
        AutomateCarGear a = new AutomateCarGear();
        a.switchGearTo1();
        a.switchGearTo2();
        a.switchGearTo3();
        a.switchGearTo4();
        a.takeReverse();
    }
}
