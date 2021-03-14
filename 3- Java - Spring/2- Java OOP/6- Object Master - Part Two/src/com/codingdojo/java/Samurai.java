package com.codingdojo.java;

class Samurai extends Human {
    static int samuraiCount = 0;
    //call constructor
    public Samurai() {
//        attributes
        this.setHealth(200);
        samuraiCount +=1;

    }

    public Samurai(String name) {
//        attributes
        this.setHealth(200);
        this.setName(name);
        samuraiCount +=1;
    }


    //Method deathblow
    public void deathBlow(Human human) {
        human.setHealth(0);
        this.setHealth(this.getHealth() / 2);
        System.out.println(this.getName() + " has killed " + human.getName());
    }

    //Method self heal
    public void meditate() {
        this.setHealth(this.getHealth() + this.getHealth() / 2);
        System.out.println(this.getName() + " has meditated and healed." + this.getName() + "'s health is now" +
                " " +
                this.getHealth());
    }

    public int howMany() {
        System.out.println(samuraiCount);
        return samuraiCount;
    }
}