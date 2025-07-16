package com.revature.assign1;

public class Main_2calc {
    public static void main(String[] args){
        CalcTwoClass s = new CalcTwoClass();
        int add = s.addition(20,30);
        int sub = s.subtraction(20,30);
        double mul = s.division(120,30);
        int div = s.multiplication(20,30);
        System.out.println("The addition of 20 and 30 is done using the two classes: "+add);
        System.out.println("The subtraction of 20 and 30 is done using the two classes: "+sub);
        System.out.println("The multiplication of 20 and 30 is done using the two classes: "+mul);
        System.out.println("The division of 120 and 30 is done using the two classes: "+div);
    }
}
