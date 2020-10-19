package com.pickpizza;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner(); // Khởi tạo một owner
        Manager manager = new Manager(owner); // khởi tạo một manager
        Waiter waiter = Waiter.getInstance(manager);   // Khởi tạo một bồi bàn
        Customer customer = new Customer(waiter);// Khởi tạo một khách hàng với sự phục vụ của một bồi bàn

        customer.order("pizza");      // Khách hàng order món
        customer.order("steak");
        Random rd = new Random();
        int amount = rd.nextInt(4) + 1; // Gọi random 5 món
        for(int i = 0 ; i < amount ; i ++){
            int numberOfDish = rd.nextInt(2) + 1;
            switch (numberOfDish){
                case 1: customer.order("pizza");
                    break;
                case 2: customer.order("steak");
                    break;
                case 3: customer.order("egg");
            }
        }


        System.out.println("Mức độ phản hồi của khách hàng :");

        int feedbackLevel  = 1;
        Scanner sc = new Scanner(System.in);
        while (feedbackLevel > 0){
            feedbackLevel = sc.nextInt();
            switch (feedbackLevel){
                case 1: customer.feedback(1);
                    break;

                case 2: customer.feedback(2);
                    break;

                case 3: customer.feedback(3);
                    break;
                default: customer.feedback(3);
                    break;
            }
        }
        // Khách hàng khiếu nại : level 1 Waiter có thể xử
        customer.feedback(1);
        // Khách hàng khiếu nai : lavel 2 Manager có thể xử lí
        customer.feedback(2);
        // Khách hàng khiếu nại : level > 3 Owner xử lí
        customer.feedback(3);
     
    }
}
