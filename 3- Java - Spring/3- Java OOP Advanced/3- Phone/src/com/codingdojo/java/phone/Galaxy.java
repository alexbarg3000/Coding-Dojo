package com.codingdojo.java.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        System.out.print("Galaxy " + getVersionNumber() + " says ");
        return getRingTone();    }
    @Override
    public String unlock() {
        return "Face detected, unlocked";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier() + " has " +
                getBatteryPercentage() + "% battery change.");
    }
}