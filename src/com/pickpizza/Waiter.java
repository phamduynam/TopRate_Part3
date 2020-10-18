package com.pickpizza;


// Đóng vai trò làm cầu nối giữa Customer và Chef: Invoker
// Đóng vai trò làm Singleton

public class Waiter implements Feedback{
    private static Waiter instance ;
    public Manager manager;
    private Waiter() {

    }
    private Waiter(Manager manager){
        this.manager = manager;
    }
    public static synchronized Waiter getInstance(Manager manager){ // Tạo synchronized để đảm bảo tại cùng một thời điểm chỉ có một luồng duy nhất try cập getInstance()
        if (instance == null){
            instance = new Waiter(manager);
        }
        return instance;
    }
    public static synchronized Waiter getInstance(){ // Tạo synchronized để đảm bảo tại cùng một thời điểm chỉ có một luồng duy nhất try cập getInstance()
        if (instance == null){
            instance = new Waiter();
        }
        return instance;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public static void takeOrder(Menu menuOrder) {
        System.out.println("Waiter take new order " + menuOrder.toString());
        menuOrder.execute();
    }

    @Override
    public void handleRequest(int feedbackLevel) {
        if(feedbackLevel <= 1){
            System.out.println("Waiter Sorry !!!");
        }else{
            this.manager.handleRequest(feedbackLevel);
        }
    }
}



