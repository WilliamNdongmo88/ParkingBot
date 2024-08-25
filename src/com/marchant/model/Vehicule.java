package com.marchant.model;

public class Vehicule {
    private String registrationNumber;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCategory(){
        return "VEHICULE";
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
