package com.rental;

public class Car extends Vehicle {
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 1.2; // 20% extra for cars
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); // Use the inherited method for availability check
    }
}
