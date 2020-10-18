package com.pickpizza;

// Đóng vai trò là Client
public class Customer {
    private Waiter waiter;

    public Customer(Waiter waiter) {
        this.waiter = waiter;
    }

    public void order(String request) {
        Menu menu = null;
        if (request.toLowerCase().equals("pizza")) {
            menu = new Pizza();
        }
        if (request.toLowerCase().equals("steak")) {
            menu = new Steak();
        }
        waiter.takeOrder(menu);
    }

    public void feedback(int level){
        this.waiter.handleRequest(level);
    }
}
