package com.rental;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private boolean completed;

    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.completed = false;
    }

    public void completeTransaction() {
        completed = true;
        System.out.println("Transaction completed for " + customer.getName() + " and " + vehicle.getModel());
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDays() {
        return days;
    }
}
