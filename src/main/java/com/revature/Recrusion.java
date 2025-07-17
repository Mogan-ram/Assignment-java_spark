package com.revature;

import java.util.Scanner;

public class Recrusion {

    static int recru(int x){
        if(x==1) return 1;
        return x +recru(x-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        System.out.println("Give a number");
        int z = sc.nextInt();
        int res = recru(z);
        System.out.println("The sum  of the given number is: "+res);





    }
}
