package com.revature.assign1;

public class Calc_oneClass {
    public int addition(int x, int y){
        return x+y;
    }
    public int subtraction(int x, int y){
        return x-y;
    }
    public int multiplication(int x, int y){
        return x*y;
    }
    public double division(int x, int y){
        return (double)x/y;
    }

    public static void main(String[] args){
        Calc_oneClass s = new Calc_oneClass();
        int add = s.addition(20,30);
        int sub = s.subtraction(20,30);
        double mul = s.division(120,30);
        int div = s.multiplication(20,30);
        System.out.println("The addition of 20 and 30 is: "+add);
        System.out.println("The subtraction of 20 and 30 is: "+sub);
        System.out.println("The multiplication of 20 and 30 is: "+mul);
        System.out.println("The division of 120 and 30 is: "+div);
    }
}
