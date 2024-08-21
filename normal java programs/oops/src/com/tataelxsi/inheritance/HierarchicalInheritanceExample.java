package com.tataelxsi.inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat says meow!");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog says woof!");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat(); // Calls the inherited eat() method
        myCat.meow();

        Dog myDog = new Dog();
        myDog.eat(); // Calls the inherited eat() method
        myDog.bark();
    }
}

