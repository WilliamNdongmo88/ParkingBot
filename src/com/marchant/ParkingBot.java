package com.marchant;

import com.marchant.model.Bicycle;
import com.marchant.model.Car;
import com.marchant.model.Ticket;
import com.marchant.model.Vehicule;
import service.ParkingService;

public class ParkingBot {
    static ParkingService parkingService = new ParkingService();

    public static void main(String[] args) {
        ProcessVehicule();
    }

    private static void ProcessVehicule() {
        Vehicule vehicule = new Vehicule();
        vehicule.setRegistrationNumber("LS-458-P1");
        Ticket ticket = parkingService.traiterVehiculeEntrant(vehicule);
        System.out.println(ticket);

        Vehicule voiture = new Car();
        voiture.setRegistrationNumber("LT-879-P2");
        Ticket ticketVoiture = parkingService.traiterVehiculeEntrant(voiture);
        System.out.println(ticketVoiture);

        Vehicule threecycle = new Bicycle();
        threecycle.setRegistrationNumber("OU-589-P3");
        Ticket ticketThreecycle = parkingService.traiterVehiculeEntrant(threecycle);
        System.out.println(ticketThreecycle);
    }
}