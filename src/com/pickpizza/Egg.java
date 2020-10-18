package com.pickpizza;

public class Egg {
    Chef chef;

    public Egg(Chef chef) {
        this.chef = chef;
    }

    public Egg() {
        this.chef = new Chef();
    }

    @Override
    public String toString() {
        return "Egg" ;
    }
}
