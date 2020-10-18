package com.pickpizza;

public class Owner implements Feedback {

    public Owner() {
    }

    @Override
    public void handleRequest(int feedbackLevel) {
        System.out.println("Owner Sorry!!!");
    }
}
