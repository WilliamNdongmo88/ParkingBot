package com.marchant;

import com.marchant.model.Bicycle;
import com.marchant.model.Car;
import com.marchant.model.Ticket;
import com.marchant.model.Vehicule;
import service.ParkingService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParkingBot {
    static ParkingService parkingService = new ParkingService();

    public static void main(String[] args) {
        ProcessVehicule();
    }

    private static void ProcessVehicule() {
        ArrayList<Ticket> ticketList = new ArrayList<>();
        Map<Integer,Ticket> ticketMap = new HashMap<>();
        Integer position = 0;

        Vehicule vehicule = new Vehicule();
        vehicule.setRegistrationNumber("LS-458-P1");
        Ticket ticketVehicule = parkingService.traiterVehiculeEntrant(vehicule);
        ticketList.add(ticketVehicule);

        Vehicule voiture = new Car();
        voiture.setRegistrationNumber("LT-879-P2");
        Ticket ticketVoiture = parkingService.traiterVehiculeEntrant(voiture);
        ticketList.add(ticketVoiture);

        Vehicule threecycle = new Bicycle();
        threecycle.setRegistrationNumber("OU-589-P3");
        Ticket ticketThreecycle = parkingService.traiterVehiculeEntrant(threecycle);
        ticketList.add(ticketThreecycle);

        System.out.println("Dictionnaire/Map Triatement des sorties par lot");
        for (Ticket ticket : ticketList) {
            System.out.println(parkingService.traiterVehiculeEntrant(ticket.getVehicule()));
            ticketMap.put(position, ticket);
            position ++;
        }
        Set<Integer> keySet = ticketMap.keySet();
        for(Integer key : keySet){
            System.out.println("Position dans la liste "+ key + " : "+ ticketMap.get(key).getVehicule().getCategory());
        }
    }
}