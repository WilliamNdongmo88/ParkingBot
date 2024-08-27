package service;

import com.marchant.model.Ticket;
import com.marchant.model.Vehicule;
import com.marchant.model.VehiculeModelEnum;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class ParkingService {
    public Ticket traiterVehiculeEntrant(Vehicule vehicule){
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setInteringTime(now);
        ticket.setVehicule(vehicule);
        return ticket;
    }

    public Ticket generatAmountTicket(Ticket ticket){
        Random random = new Random();
        int randomNumber = random.nextInt(24) + 1;
        long millisInHours = TimeUnit.HOURS.toMillis(randomNumber);
        Date now = new Date();
        Date futureDate = new Date(now.getTime() + millisInHours);
        ticket.setExistTime(futureDate);

        double amountTicket = 0;
        double prixVehiculeParMinite = 0.05;
        double prixCitadineParMinite = 0.08;
        double prixTroisRouesParMinite = 0.03;

        long differenceInMillis = ticket.getExistTime().getTime() - ticket.getInteringTime().getTime();
        long differenceInMinutes = TimeUnit.MILLISECONDS.toMinutes(differenceInMillis);
        VehiculeModelEnum vehiculeCategory = ticket.getVehicule().getCategory();

        switch (vehiculeCategory){
            case CITADINE:
                amountTicket = prixCitadineParMinite * differenceInMinutes;
                break;
            case TROISROUES:
                amountTicket = prixTroisRouesParMinite * differenceInMinutes;
                break;
            default:
                amountTicket = prixVehiculeParMinite * differenceInMinutes;
        }
        ticket.setAmount(amountTicket);
        return ticket;
    }
}
