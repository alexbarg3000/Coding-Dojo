package com.codingdojo.java;

public class Mammal {

    // Set mammals' default energy level to 100:
    private int energyLevel = 100;


    //Empty constructor
    public Mammal() {}


    // Getter and setter methods for the energy level attribute

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    //Method shows the animals energy level

    public int displayEnergy(){
        System.out.println("My energy level is "+this.energyLevel);
        if (this.energyLevel <= 0) {
            System.out.println("The animal has no energy left");
        }
        return this.energyLevel;
    }
}
