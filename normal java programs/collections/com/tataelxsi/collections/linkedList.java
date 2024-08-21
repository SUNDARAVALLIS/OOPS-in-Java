package com.tataelxsi.collections;
import java.util.*;

public class linkedList {

	public static void main(String[] args) {
        // Create a linked list using LinkedList (part of the Java Collections Framework)
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Add elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        
        // Initialize the logger
        System.Logger logger = System.getLogger(linkedList.class.getName());
 
        // Add elements
        linkedList.add(6); // Adds 6 to the end
        linkedList.addFirst(0); // Adds 0 to the beginning
        logger.log(System.Logger.Level.INFO, "After adding elements: " + linkedList);
 
        // Remove elements
        linkedList.remove(3); // Removes element at index 3
        linkedList.removeFirst(); // Removes the first element
        logger.log(System.Logger.Level.INFO, "After removing elements: " + linkedList);
 
        // Retrieve elements
        int firstElement = linkedList.getFirst();
        int lastElement = linkedList.getLast();
        logger.log(System.Logger.Level.INFO, "First element: " + firstElement);
        logger.log(System.Logger.Level.INFO, "Last element: " + lastElement);
 
        // Search for elements
        boolean containsThree = linkedList.contains(3);
        logger.log(System.Logger.Level.INFO, "Contains 3? " + containsThree);
 
        // Size of the linked list
        int size = linkedList.size();
        logger.log(System.Logger.Level.INFO, "Size of the linked list: " + size);
 
        // Iterating over elements
        StringBuilder elements = new StringBuilder("Linked list elements: ");
        for (int element : linkedList) {
            elements.append(element).append(" ");
        }
        logger.log(System.Logger.Level.INFO, elements.toString());
 
        // Clear the linked list
        linkedList.clear();
        logger.log(System.Logger.Level.INFO, "Linked list after clearing: " + linkedList);
 
        // Additional methods
        linkedList.add(7); // Adds 7 to the end
        linkedList.addLast(8); // Adds 8 to the end
        logger.log(System.Logger.Level.INFO, "After additional additions: " + linkedList);
 
        // Check if the linked list is empty
        boolean isEmpty = linkedList.isEmpty();
        logger.log(System.Logger.Level.INFO, "Is the linked list empty? " + isEmpty);
    }
}
