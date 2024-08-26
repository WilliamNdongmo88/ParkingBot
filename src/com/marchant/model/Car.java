package com.marchant.model;

public class Car extends Vehicule{
    @Override
    public VehiculeModelEnum getCategory() {
        return VehiculeModelEnum.CITADINE;
    }
}
