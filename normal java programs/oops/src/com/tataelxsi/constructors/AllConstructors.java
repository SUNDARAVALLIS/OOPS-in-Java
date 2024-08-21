package com.tataelxsi.constructors;

public class AllConstructors {
    private String name;
    private int age;

    // Default constructor
    public AllConstructors() {
        // Initialize default values
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public AllConstructors(String empName, int empAge) {
        name = empName;
        age = empAge;
    }

    // Getter methods (optional)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Using the default constructor
        AllConstructors emp1 = new AllConstructors();
        System.out.println("Employee 1: Name = " + emp1.getName() + ", Age = " + emp1.getAge());

        // Using the parameterized constructor
        AllConstructors emp2 = new AllConstructors("John Doe", 30);
        System.out.println("Employee 2: Name = " + emp2.getName() + ", Age = " + emp2.getAge());
    }
}
