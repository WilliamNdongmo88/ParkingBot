package com.marchant;

import com.marchant.model.Ticket;
import com.marchant.model.Vehicule;
import service.ParkingService;

public class ParkingBot {

    public static void main(String[] args) {
        ProcessVehicule();
    }

    private static void ProcessVehicule() {
        Vehicule vehicule = new Vehicule();
        vehicule.setRegistrationNumber("LS-123-PM");
        vehicule.setCategory("CITADINE");
        ParkingService parkingService = new ParkingService();
        Ticket ticket = parkingService.traiterVehiculeEntrant(vehicule);
        System.out.println("Ticket : " + ticket);
    }
}