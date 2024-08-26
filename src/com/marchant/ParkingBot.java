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
        Ticket[] tabTicket = new Ticket[3];
        Vehicule vehicule = new Vehicule();
        vehicule.setRegistrationNumber("LS-458-P1");
        tabTicket[0] = parkingService.traiterVehiculeEntrant(vehicule);

        Vehicule voiture = new Car();
        voiture.setRegistrationNumber("LT-879-P2");
        tabTicket[1] = parkingService.traiterVehiculeEntrant(voiture);

        Vehicule threecycle = new Bicycle();
        threecycle.setRegistrationNumber("OU-589-P3");
        tabTicket[2] = parkingService.traiterVehiculeEntrant(threecycle);

        System.out.println("Triatement des sorties par lot");
        for (int i = 0; i < tabTicket.length; i++) {
            System.out.println(parkingService.traiterVehiculeEntrant(tabTicket[i].getVehicule()));
        }
    }
}