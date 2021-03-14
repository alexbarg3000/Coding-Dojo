package com.codingdojo.java;

class Ninja extends Human {
    //call constructor
    public Ninja() {
//        attributes
        this.setStealth(10);
    }

    public Ninja(String name) {
//        attributes
        this.setStealth(10);
        this.setName(name);
    }

    //Method steal health
    public void steal(Human human) {
        human.setHealth(human.getHealth() - this.getStealth());
        this.setHealth(this.getHealth() + this.getStealth());
        System.out.println(this.getName() + " drained life from " + human.getName() + " for " + this.getStealth() +
                " " +
                "damage! " + human.getName() + "'s heath is now " + human.getHealth());
    }

    //Method escape
    public void runAway() {
        this.setHealth(this.getHealth() - 10);
        System.out.println(this.getName() + " has escaped but have lost " + 10 + " from their health which has" +
                " " +
                "now become" + this.getHealth());
    }

}