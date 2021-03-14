package com.codingdojo.java;

public class Human {
    // Set human's default attributes:
    private String name = "";
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
    //Empty constructor
    public Human() {
    }
    public Human(String name) {
        this.name = name;
    }

    // Getter and setter methods for  attributes

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Method shows the human attack
    public void attack(Human human) {
        human.setHealth(human.getHealth() - this.getStrength());
        System.out.println(this.getName() + " attacked " + human.getName() + " for " + this.getStrength() + " " +
                "damage! " + human.getName() + "'s heath is now " + human.getHealth());
    }
}
