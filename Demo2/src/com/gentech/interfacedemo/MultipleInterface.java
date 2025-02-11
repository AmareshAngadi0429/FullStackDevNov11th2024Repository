package com.gentech.interfacedemo;
interface RaceCar
{
    void MaxSpeedOfRaceCar(int speed);
}
interface Jeep
{
    void MaxSpeedOfJeep(int speed);
}
interface Truck
{
    void MaxSpeedOfTruck(int speed);
}
interface Bus
{
    void MaxSpeedOfBus(int speed);

}interface Auto
{
    void MaxSpeedOfAuto(int speed);
}
class Speed implements RaceCar,Auto,Jeep,Truck,Bus
{

    @Override
    public void MaxSpeedOfAuto(int speed) {

    }

    @Override
    public void MaxSpeedOfBus(int speed) {
        System.out.println("Max speed of a bus is : "+speed);
    }

    @Override
    public void MaxSpeedOfJeep(int speed) {
        System.out.println("Max speed of a jeep is : "+speed);
    }

    @Override
    public void MaxSpeedOfRaceCar(int speed) {
        System.out.println("Max speed of a race car is : "+speed);
    }

    @Override
    public void MaxSpeedOfTruck(int speed) {
        System.out.println("Max speed of a truck is : "+speed);
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        Speed s = new Speed();
        s.MaxSpeedOfAuto(40);
        s.MaxSpeedOfBus(60);
        s.MaxSpeedOfJeep(80);
        s.MaxSpeedOfRaceCar(200);
        s.MaxSpeedOfTruck(50);
    }
}
