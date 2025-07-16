package com.revature.assign1;

import java.awt.*;
import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day");
        String i = sc.nextLine();
        System.out.println("This is example of IF and IF-else statement, so first enter a x value");
        int x = sc.nextInt();
        System.out.println("Enter y value");;
        int y =sc.nextInt();
        if(x > y){
            System.out.println("X value is greater than y and this is example of if statement");

        }
        if(y<x){
            System.out.println("X value is greater than y and this is example of if statement");

        }else{
            System.out.println("y value is lesser than y and this is example of if-else statement");


        }
        switch (i.toLowerCase()){
            case "monday":
                System.out.println("Monday blues 😓😓?");
                break;
            case "tuesday":
                System.out.println("Tuesday terrors ah..🥲🥲");
                break;
            case "wednesday":
                System.out.println("Wednesday woes😑😑.. hang in there you are half way through");
                break;
            case "thursday":
                System.out.println("IT's thursday huh.. thirsty for party ?");
                break;
            case "friday":
                System.out.println("OOh you made to friday you must feel the party brewing for tomorrow");
                break;
            case "saturday":
                System.out.println("Saturday should be all about right?");
                break;
            case "sunday":
                System.out.println("The creeping dread of Monday approaching. The weekend is ending.");
            default:
                System.out.println("bruh i asked you type in a day☹️☹️☹️");
        }

        for(int j =0;j<5;j++){
            System.out.println("Example of for loop "+j);
        }
        int w=0;
        while(w<5){
            System.out.println("While loop says hello "+w);
            w++;
        }

        do {
            System.out.println("DO-While loop says hello "+w);
            w++;
        }while(w<5);
    }
}
