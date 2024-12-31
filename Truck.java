package com.rental;

public class Truck extends Vehicle {
    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + 50; // Flat $50 additional charge
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); // Use the inherited method for availability check
    }
}
