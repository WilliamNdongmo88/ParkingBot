package com.marchant;

import com.marchant.model.Car;
import com.marchant.model.Ticket;
import com.marchant.model.Vehicule;
import service.ParkingService;

public class ParkingBot {
    static ParkingService parkingService = new ParkingService();

    public static void main(String[] args) {
        ProcessVehicule();
        //passage par valeur
        /*int a = 10;
        int b = a;
        System.out.println("=> "+ a);
        System.out.println("=> "+ b);
        a = 15;
        System.out.println("=> "+ a);
        System.out.println("=> "+ b);
        a = 0;
        System.out.println("=> "+ a);
        System.out.println("=> "+ b);*/
    }

    private static void ProcessVehicule() {

        Vehicule voiture = new Car();
        voiture.setRegistrationNumber("LT-879-P2");
        //Passage par reference
        Ticket ticketVoiture = parkingService.traiterVehiculeEntrant(voiture);
        System.out.println(ticketVoiture);
        parkingService.generatAmountTicket(ticketVoiture);
        System.out.println(ticketVoiture);
    }
}