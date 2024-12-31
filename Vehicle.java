package com.rental;

public abstract class Vehicle implements Rentable {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructor with validation
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        if (vehicleId == null || model == null) throw new IllegalArgumentException("Invalid input");
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;  // Default to available
    }

    // Getters and setters
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        if (vehicleId == null) throw new IllegalArgumentException("Vehicle ID cannot be null");
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) throw new IllegalArgumentException("Model cannot be null");
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate <= 0) throw new IllegalArgumentException("Rental rate must be positive");
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Abstract methods
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            System.out.println(customer.getName() + " rented " + this.getModel() + " for " + days + " days.");
            setAvailable(false); // Vehicle is now rented out
        } else {
            System.out.println(this.getModel() + " is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println(this.getModel() + " has been returned.");
    }
}
