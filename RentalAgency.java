package com.rental;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        fleet = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addVehicleToFleet(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
        vehicle.rent(customer, days);
        RentalTransaction transaction = new RentalTransaction(customer, vehicle, days);
        transactions.add(transaction);
    }

    public void returnVehicle(Customer customer, Vehicle vehicle) {
        vehicle.returnVehicle();
        RentalTransaction transaction = findTransaction(customer, vehicle);
        if (transaction != null) {
            transaction.completeTransaction();
        }
    }

    private RentalTransaction findTransaction(Customer customer, Vehicle vehicle) {
        for (RentalTransaction transaction : transactions) {
            if (transaction.getCustomer().equals(customer) && transaction.getVehicle().equals(vehicle)) {
                return transaction;
            }
        }
        return null;
    }
}
