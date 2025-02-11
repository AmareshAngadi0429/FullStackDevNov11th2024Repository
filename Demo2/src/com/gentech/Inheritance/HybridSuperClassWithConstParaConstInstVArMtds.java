package com.gentech.Inheritance;

class Vehicle {
    String type;
    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle type: " + type);
    }

    void displayType() {
        System.out.println("This is a " + type);
    }
}
class Car extends Vehicle {
    String brand;
    Car(String type, String brand) {
        super(type);
        this.brand = brand;
        System.out.println("Car brand: " + brand);
    }
    void displayCarInfo() {
        System.out.println("Car type: " + type + ", Brand: " + brand);
    }
}

class Bike extends Vehicle {
    String model;
    Bike(String type, String model) {
        super(type);
        this.model = model;
        System.out.println("Bike model: " + model);
    }
    void displayBikeInfo() {
        System.out.println("Bike type: " + type + ", Model: " + model);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    ElectricCar(String type, String brand, int batteryCapacity) {
        super(type, brand);
        this.batteryCapacity = batteryCapacity;
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }

    void displayElectricCarInfo() {
        System.out.println("Electric Car type: " + type + ", Brand: " + brand + ", Battery: " + batteryCapacity + " kWh");
    }
}

public class HybridSuperClassWithConstParaConstInstVArMtds {
    public static void main(String[] args) {
        Bike bike = new Bike("Two-wheeler", "Ducati Monster");
        bike.displayBikeInfo();
        System.out.println();
        ElectricCar eCar = new ElectricCar("Four-wheeler", "Tesla", 75);
        eCar.displayElectricCarInfo();
    }
}
