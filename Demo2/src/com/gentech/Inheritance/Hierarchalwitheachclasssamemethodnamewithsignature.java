package com.gentech.Inheritance;

class VVehicle {
    String type;
    VVehicle(String type) {
        this.type = type;
    }
    void displayInfo() {
        System.out.println("This is a Vehicle of type: " + type);
    }
}
class CCar extends VVehicle {
    String brand;
    CCar(String type, String brand) {
        super(type);
        this.brand = brand;
    }
    @Override
    void displayInfo() {
        System.out.println("This is a Car. Type: " + type + ", Brand: " + brand);
    }
}
class BBike extends VVehicle {
    String model;
    BBike(String type, String model) {
        super(type);
        this.model = model;
    }
    @Override
    void displayInfo() {
        System.out.println("This is a Bike. Type: " + type + ", Model: " + model);
    }
}
class Truck extends VVehicle {
    int loadCapacity;
    Truck(String type, int loadCapacity) {
        super(type);
        this.loadCapacity = loadCapacity;
    }
    @Override
    void displayInfo() {
        System.out.println("This is a Truck. Type: " + type + ", Load Capacity: " + loadCapacity + " tons.");
    }
}


public class Hierarchalwitheachclasssamemethodnamewithsignature {
    public static void main(String[] args) {
        CCar car = new CCar("Four-wheeler", "Toyota");
        BBike bike = new BBike("Two-wheeler", "Yamaha");
        Truck truck = new Truck("Heavy vehicle", 10);
        car.displayInfo();
        bike.displayInfo();
        truck.displayInfo();
    }
}
