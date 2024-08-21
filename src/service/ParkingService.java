package service;

import com.marchant.model.Ticket;
import com.marchant.model.Vehicule;

import java.util.Date;

public class ParkingService {
    public Ticket traiterVehiculeEntrant(Vehicule vehicule){
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setInteringTime(now);
        ticket.setVehicule(vehicule);
        return ticket;
    }
}
