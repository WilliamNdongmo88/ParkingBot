package com.marchant.model;

public class Bicycle extends  Vehicule{
    @Override
    public VehiculeModelEnum getCategory() {
        return VehiculeModelEnum.TROISROUES;
    }
}
