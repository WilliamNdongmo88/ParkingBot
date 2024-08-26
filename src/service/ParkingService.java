package service;

import com.marchant.model.Ticket;
import com.marchant.model.Vehicule;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class ParkingService {
    public Ticket traiterVehiculeEntrant(Vehicule vehicule){
        Random random = new Random();
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setInteringTime(now);
        int randomNumber = random.nextInt(24) + 1;
        //System.out.println("Nombre aléatoire entre 1 et 48: " + randomNumber);
        long millisInHours = TimeUnit.HOURS.toMillis(randomNumber);
        Date futureDate = new Date(now.getTime() + millisInHours);
        ticket.setExistTime(futureDate);
        ticket.setVehicule(vehicule);
        double amountTicket = generatAmountTicket(ticket.getInteringTime(),ticket.getExistTime(), ticket.getVehicule().getCategory());
        ticket.setAmount(amountTicket);
        return ticket;
    }

    public double generatAmountTicket(Date interingTime, Date existTime, String vehiculeCategory){
        double amountTicket = 0;
        double prixVehiculeParMinite = 0.5;
        double prixCitadineParMinite = 0.8;
        double prixTroisRouesParMinite = 0.3;

        long differenceInMillis = existTime.getTime() - interingTime.getTime();
        long differenceInMinutes = TimeUnit.MILLISECONDS.toMinutes(differenceInMillis);
        if(vehiculeCategory == "CITADINE"){
            amountTicket = prixCitadineParMinite * differenceInMinutes;
        } else if (vehiculeCategory == "3 ROUES") {
            amountTicket = prixTroisRouesParMinite * differenceInMinutes;
        }else {
            amountTicket = prixVehiculeParMinite * differenceInMinutes;
        }

        return amountTicket;
    }
}
