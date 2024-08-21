package com.tataelxsi.methodOverriding;
class Telephone{
	
	public void description() {
		System.out.println("This is Telephone class.");
	}
}
class CellularPhone extends Telephone{
	
	public void description() {
		System.out.println("This is Cellular Phone class.");
	}
}
class SmartPhone extends CellularPhone{
	
	public void description() {
		System.out.println("This is Smart Phone class.");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Telephone tele = new Telephone();
		CellularPhone cell = new CellularPhone();
		SmartPhone smart = new SmartPhone();
		
		tele.description(); // belongs to Telephone class
		cell.description(); // overridden version of CellularPhone class
		smart.description(); // overridden version of SmartPhone class
	}
}
		
		/*
		 1. Method overriding is achieved only by inheritance.
		 2. Method overriding -> methods with same name and signature with
		    different implementations.
		 3. Return type, method name, number of arguments and data types of 
		    arguments should be same to achieve method overriding.
		 4. change in return type will lead to error.
		 5. change in number of arguments and data types of arguments will lead
		    to method overloading which we don't want.
		 6. if A, B and C are three classes with same function fun(), 
		    Class A -> Original version of fun()
		    Class B -> Overridden version of Class A fun()
		    Class C -> Overridden version of Class B fun()
		 7. Method overriding is called run time polymorphism. 
		 */

