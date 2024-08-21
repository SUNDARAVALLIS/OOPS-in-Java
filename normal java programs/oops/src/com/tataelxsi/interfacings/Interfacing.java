package com.tataelxsi.interfacings;
//Declare an interface named "Polygon"
interface Polygon {
 void getArea(int length, int breadth); // Abstract method (no implementation)
}

//Implement the Polygon interface in the Rectangle class
class Rectangle implements Polygon {
 // Implementation of the abstract method
 public void getArea(int length, int breadth) {
     System.out.println("The area of the rectangle is " + (length * breadth));
 }
}

public class Interfacing {
 public static void main(String[] args) {
     Rectangle r1 = new Rectangle();
     r1.getArea(5, 6); // Calls the overridden getArea() method in Rectangle
 }
}

