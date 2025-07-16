package com.revature.assign4;

public class Dog extends Canine {
    public Dog(String name) {
        super(name);
    }


    @Override
    public void makeNoise() {
        System.out.println(name + " says Woof");
    }
}
