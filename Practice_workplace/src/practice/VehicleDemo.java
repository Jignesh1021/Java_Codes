package practice;

// Parent class
class Vehicle {

    String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Method to be overridden
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Child class Car
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    // Overriding method
    @Override
    void start() {
        System.out.println(brand + " Car starts with key");
    }
}

// Child class Bike
class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    // Overriding method
    @Override
    void start() {
        System.out.println(brand + " Bike starts with kick");
    }
}

// Main class
public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle v;

        // Runtime polymorphism
        v = new Car("Toyota");
        v.start();

        v = new Bike("Honda");
        v.start();
    }
}