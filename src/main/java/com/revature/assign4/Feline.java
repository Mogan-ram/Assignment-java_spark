package com.revature.assign4;

public abstract class Feline implements Animals {
    protected String name;
    public Feline(String name) { this.name = name; }
    public String getName() { return name; }
}
