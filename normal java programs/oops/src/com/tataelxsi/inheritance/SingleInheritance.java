package com.tataelxsi.inheritance;

class Animalsi {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dogs extends Animalsi {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dogs labrador = new Dogs();
        labrador.eat(); // Calls the inherited method from Animal
        labrador.bark(); // Calls the method specific to Dog
    }
}

