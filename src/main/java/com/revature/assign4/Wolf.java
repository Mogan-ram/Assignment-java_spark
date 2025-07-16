package com.revature.assign4;

public class Wolf extends  Canine{
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says Woof");
    }
}
