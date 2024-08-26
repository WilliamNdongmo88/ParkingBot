package com.marchant.model;

import java.util.Date;

public class Ticket {
    private double amount;
    private Vehicule vehicule;
    private Date interingTime;
    private Date existTime;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Date getInteringTime() {
        return interingTime;
    }

    public void setInteringTime(Date interingTime) {
        this.interingTime = interingTime;
    }

    public Date getExistTime() {
        return existTime;
    }

    public void setExistTime(Date existTime) {
        this.existTime = existTime;
    }

    @Override
    public String toString() {
        return "Le montant du ticket est "+ amount +" $ pour le véhicule de type "+ vehicule.getCategory() +" immatriculé "+
                vehicule.getRegistrationNumber() + " entré le " + interingTime + " et sorti le "+ existTime;
    }
}
