package com.codingdojo.java;

class Bat extends Mammal {
    public Bat() {
        this.setEnergyLevel(300);
    }
        public void fly(){
            System.out.println("Dracula spread its wings and is flying");
            this.setEnergyLevel(this.getEnergyLevel()-50);
            displayEnergy();
        }

        public void eatHumans(){
            System.out.println("Dracula cought and attacked the priest and sucking his blood out");
            this.setEnergyLevel(this.getEnergyLevel()+25);
            displayEnergy();
        }

        public void attackTown(){
            System.out.println("We are being attacked! Everyone run to the church!!");
            this.setEnergyLevel(this.getEnergyLevel()-100);
            displayEnergy();
        }

}