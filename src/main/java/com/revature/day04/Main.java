package com.revature.day04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer();

        // Collecting customer info via setters
        System.out.print("Enter username: ");
        c.setUserName(sc.nextLine());

        System.out.print("Enter mail ID: ");
        c.setMailId(sc.nextLine());

        System.out.print("Enter initial balance: ");
        c.setBalance(sc.nextInt());

        System.out.print("Enter phone number: ");
        c.setPhone(sc.nextLong());

        System.out.println("\n--- Customer Info Registered ---");
        System.out.println("Name: " + c.getUserName());
        System.out.println("Email: " + c.getMailId());
        System.out.println("Balance: " + c.getBalance());
        System.out.println("Phone: " + c.getPhone());

        // Withdrawal - Checked Exception
        System.out.print("\nEnter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();
        try {
            int dis = c.withDrawl(withdrawAmount); // throws checked CustomException
            System.out.println("Withdrawal successful. New balance: " + dis);
        } catch (InvalidAmount e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }


        System.out.print("\nEnter amount to deposit: ");
        int depositAmount = sc.nextInt();
        try {
            int res = c.deposit(depositAmount);
            System.out.println("Deposit successful. New balance: " +res );
        } catch (InvalidDeposit e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }

        sc.close();
    }
}