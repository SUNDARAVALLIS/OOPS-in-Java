package com.tataelxsi.abstraction; // Specify the package name (lowercase 'a' in 'abstract')

// Abstract class definition
abstract class Bike {
    public void run() {
    }
 
    abstract void playMusic();// Abstract method declaration (no implementation)
}

// Concrete subclass that extends Bike
class Honda extends Bike {
    
    public void playMusic() {
        System.out.println("Hi, this is your bike.");
    }	
}

public class Abstract {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
        h.playMusic();;
    }
}

