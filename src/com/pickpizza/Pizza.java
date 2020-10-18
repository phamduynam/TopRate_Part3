package com.pickpizza;

// Đóng vai trò làm ConcreteCommand
public class Pizza implements Menu {
    private Chef chef;

    public Pizza(){
        this.chef = new Chef();
    }

    @Override
    public void execute() {
        chef.makePizza();
    }

    @Override
    public String toString() {
        return "Pizza";
    }

}
