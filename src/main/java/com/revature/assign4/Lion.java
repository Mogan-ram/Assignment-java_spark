package com.revature.assign4;

public class Lion extends Feline{
    public Lion(String name) { super(name); }

    @Override
    public void makeNoise() {
        System.out.println(name + " says Roars");
    }
}
