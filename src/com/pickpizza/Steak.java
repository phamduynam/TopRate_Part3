package com.pickpizza;

public class Steak implements Menu{
    private Chef chef;

    public Steak(Chef chef) {
        this.chef = chef;
    }

    public Steak() {
        this.chef = new Chef();
    }

    @Override
    public void execute() {
        chef.makeSteak();
    }

    @Override
    public String toString() {
        return "Steak";
    }
}
