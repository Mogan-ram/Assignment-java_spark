package com.revature.assign3;

public class Main {
    public static void main(String[] args){
        Customer c1 = new Customer("Wick", 98886767, 450);
        String msg1 = c1.greet(c1.getBill());
        System.out.println("Hii "+c1.getUserName());
        System.out.println(msg1);
        Customer c2 = new Customer("Rambo", 98886767, 650);
        String msg2 = c2.greet(c2.getBill(),c2.getUserName());
        System.out.println(msg2);


    }
}
