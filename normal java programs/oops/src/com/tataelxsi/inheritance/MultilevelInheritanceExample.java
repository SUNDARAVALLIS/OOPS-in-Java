package com.tataelxsi.inheritance;

class A {
    public int a;

    void get_A_data() {
        System.out.println("Enter value of a: ");
        // Input 'a' from user
    }
}

class B extends A {
    public int b;

    void get_B_data() {
        System.out.println("Enter value of b: ");
        // Input 'b' from user
    }
}

class C extends B {
    private int c;

    void get_C_data() {
        System.out.println("Enter value of c: ");
        // Input 'c' from user
    }

    void sum() {
        int ans = a + b + c;
        System.out.println("sum: " + ans);
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an object of subclass C
        C obj = new C();
        obj.get_A_data();
        obj.get_B_data();
        obj.get_C_data();
        obj.sum();
    }
}


