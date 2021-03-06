package com.codingdojo.java.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        System.out.print("Iphone " + getVersionNumber() + " says ");
        return getRingTone();    }
    @Override
    public String unlock() {
        return "Unlocking via fingerprint";
    }
    @Override
    public void displayInfo() {
        System.out.println("Iphone " + getVersionNumber() + " from " + getCarrier() + " has " +
                getBatteryPercentage() + "% battery change.");
    }
}
