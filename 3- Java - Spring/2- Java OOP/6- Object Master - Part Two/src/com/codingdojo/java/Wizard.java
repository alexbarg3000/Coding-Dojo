package com.codingdojo.java;

class Wizard extends Human {
    //call constructor
    public Wizard() {
//        attributes
        this.setHealth(50);
        this.setIntelligence(8);
    }

    public Wizard(String name) {
        this.setHealth(50);
        this.setIntelligence(8);
        this.setName(name);
    }

    //Method heals human
    public void heal(Human human) {
        human.setHealth(human.getHealth() + this.getIntelligence());
        System.out.println(this.getName() + " healed " + human.getName() + " for " + this.getIntelligence() +
                " " +
                "damage! " + human.getName() + "'s heath is now " + human.getHealth());
    }

    //Method cast fireball on human
    public void fireball(Human human) {
        human.setHealth(human.getHealth() - 3 * this.getIntelligence());
        System.out.println(this.getName() + " burned " + human.getName() + " for " + 3 * this.getIntelligence() +
                " " +
                "damage! " + human.getName() + "'s heath is now " + human.getHealth());
    }

}