package com.rental;

public class Main {
    public static void main(String[] args) {
        // Create some vehicles
        Car car1 = new Car("C1", "Benz AMG", 40);
        Motorcycle motorcycle1 = new Motorcycle("M1", "Royal", 30);
        Truck truck1 = new Truck("T1", "Scania", 60);

        // Create a rental agency
        RentalAgency agency = new RentalAgency();
        agency.addVehicleToFleet(car1);
        agency.addVehicleToFleet(motorcycle1);
        agency.addVehicleToFleet(truck1);

        // Create a customer
        Customer customer = new Customer("Mr Joe");

        // Rent vehicles
        agency.rentVehicle(customer, car1, 5); // Rent car for 5 days
        agency.rentVehicle(customer, motorcycle1, 3); // Rent motorcycle for 3 days

        // Return vehicles
        agency.returnVehicle(customer, car1);
        agency.returnVehicle(customer, motorcycle1);
    }
}
