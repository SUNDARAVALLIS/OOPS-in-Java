package com.tataelxsi.inheritance;

class Animel{
	int noleg=4;
	public static void eat() {
		System.out.println("I can eat");
	}
	public static void walk() {
		System.out.println("I can walk");
	}
}
class Degs extends Animel{
	
}

public class InheritanceMain {
	public static void main(String args[]) {
		Degs obj=new Degs();
		System.out.println(obj.noleg);
		obj.eat();
		obj.walk();
		
	}
}
/*class Animel{
	int noleg=4;
	public static void eat() {
		System.out.println("I can eat");
	}
	public static void walk() {
		System.out.println("I can walk");
	}
}
class Degs extends Animel{//method overriding
	int noleg=5;
	public static void eat() {
		System.out.println("Dog is eating");
	}
}
public class InheritanceMain {
	public static void main(String args[]) {
		Degs obj=new Degs();
		System.out.println(obj.noleg);
		obj.eat();
		obj.walk();
		
	}

}*/
