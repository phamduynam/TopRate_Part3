package com.pickpizza;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner(); // Khởi tạo một owner
        Manager manager = new Manager(owner); // khởi tạo một manager
        Waiter waiter = Waiter.getInstance(manager);   // Khởi tạo một bồi bàn
        Customer customer = new Customer(waiter);// Khởi tạo một khách hàng với sự phục vụ của một bồi bàn

        customer.order("pizza");      // Khách hàng order món
        customer.order("steak");
        // Khách hàng khiếu nại : level 1 Waiter có thể xử
        customer.feedback(1);
        // Khách hàng khiếu nai : lavel 2 Manager có thể xử lí
        customer.feedback(2);
        // Khách hàng khiếu nại : level > 3 Owner xử lí
        customer.feedback(3);
     
    }
}
