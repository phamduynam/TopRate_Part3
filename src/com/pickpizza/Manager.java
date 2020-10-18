package com.pickpizza;

public class Manager implements  Feedback{
    private Owner owner;


    public Manager(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void handleRequest(int feedbackLevel) {
        if(feedbackLevel == 2){
            System.out.println("Manager Sorry !!!");
        }else{
            this.owner.handleRequest(feedbackLevel);
        }
    }
}
