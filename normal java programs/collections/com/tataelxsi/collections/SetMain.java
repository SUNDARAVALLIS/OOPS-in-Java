package com.tataelxsi.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(SetMain.class.getName());
        Scanner scanner = new Scanner(System.in);
 
        // Creating a HashSet
        HashSet<Integer> set = new HashSet<>();
 
        // Getting input from the user
        System.out.println("Enter the number of elements you want to add to the set:");
        int n = scanner.nextInt();
 
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            set.add(element);
        }
 
        // Displaying the set
        logger.info("Set elements: " + set);
 
        // Operations on the set
        System.out.println("Operations on Set:");
        System.out.println("1. Size of the Set: " + set.size());
       // System.out.println("1. Size of the Set: " + set.);
        System.out.println("2. Is the Set empty? " + set.isEmpty());
        // Adding elements
        System.out.println("3. Adding elements to the Set:");
        set.add(10);
        set.add(20);
        System.out.println("   Set after adding elements: " + set);
 
        // Removing elements
        System.out.println("4. Removing elements from the Set:");
        set.remove(10);
        System.out.println("   Set after removing element 10: " + set);
 
        // Checking if an element exists
        System.out.println("5. Checking if an element exists in the Set:");
        int elementToCheck = 5;
        System.out.println("   Does " + elementToCheck + " exist in the Set? " + set.contains(elementToCheck));
 
        // Clearing the Set
        System.out.println("6. Clearing the Set:");
        set.clear();
        System.out.println("   Set after clearing: " + set);
        scanner.close();
    }
}