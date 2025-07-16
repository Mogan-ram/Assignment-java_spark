package com.revature.assign2;

public class Operator {
    public static void main(String[]args){
        boolean a = true;
        boolean b = false;
        System.out.print("A is assigned ture and B is assigned as fasle");
        System.out.println("The result of !a is: " + !a);
        boolean c = a|b;
        System.out.println("The result of a|b is: " + c);
        boolean d = (!a &b)|(a&!b);
        System.out.println("The result of (!a &b)|(a&!b) is: " + d);
    }
}
