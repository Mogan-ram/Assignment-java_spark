package com.revature.assign4;

public class Main {
    public static void main(String[] args) {
        Animals cat = new Cat("Whiskers");
        Animals dog = new Dog("Rex");
        System.out.println("Cat Type: " + Animals.TYPE);
        cat.makeNoise(); // Whiskers says Meow
        System.out.println("Cat Name: " + ((Cat)cat).getName());
        System.out.println("Dog Type: " + Animals.TYPE);
        dog.makeNoise(); // Rex says Woof
        System.out.println("Dog Name: " + ((Dog)dog).getName());
    }
}
