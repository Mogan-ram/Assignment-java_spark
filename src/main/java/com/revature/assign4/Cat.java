package com.revature.assign4;

public class Cat extends Feline {
    public Cat(String name) { super(name); }

    @Override
    public void makeNoise() {
        System.out.println(name + " says Meow");
    }
}
