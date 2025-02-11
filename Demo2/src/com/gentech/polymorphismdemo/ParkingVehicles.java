package com.gentech.polymorphismdemo;
interface Parking
{
    void vehicleParkingAt();
}
class Car implements Parking
{

    @Override
    public void vehicleParkingAt() {
        System.out.println("Cars should be parked at car parking Basement");
    }
}
class Bike implements Parking
{

    @Override
    public void vehicleParkingAt() {
        System.out.println("Bikes should be parked at bike parking Basement");
    }
}
class HeavyVehicles implements Parking
{

    @Override
    public void vehicleParkingAt() {
        System.out.println("Heavy vehicles should be parked at rental parking space not at residence");
    }
}
public class ParkingVehicles {
    public static void main(String[] args) {

    }
}
