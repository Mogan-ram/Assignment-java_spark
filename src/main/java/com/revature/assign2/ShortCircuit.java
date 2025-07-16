package com.revature.assign2;

import java.util.Scanner;

public class ShortCircuit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a short circuit eg, so what it means is if the first operand in the comprasion between two more happens to be decisive in a decision then the rest will not be evaluated ");
        System.out.println("For instance if the x=false, y=true and z=true in x&&y&&z when in the if statement detects false it stops and returns the else part ");
        System.out.println("Wanna check enter three value and i'll perform the logical AND operation?");
        boolean x = sc.nextBoolean();
        boolean y = sc.nextBoolean();
        boolean z = sc.nextBoolean();
        if(x&&y&&z){
            System.out.println("AH you didn't enter any false value you are not that curious it seems");
        }else{
            System.out.println("If you entered the x as false then other two didn't get evaluated");
        }
    }
}

