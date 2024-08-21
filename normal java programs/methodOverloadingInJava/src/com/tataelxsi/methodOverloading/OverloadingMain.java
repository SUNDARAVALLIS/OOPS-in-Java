package com.tataelxsi.methodOverloading;
class Adders {
	
	Adders(){
		System.out.println("New object of Adder class is created.");
	}
	
	public void add(int a, int b){ // 2 parameters , integer arguments
		System.out.printf("%d + %d = %d\n",a,b,a+b);
	}
	
	public void add(int a,int b,int c){ // 3 parameters, integer arguments
		System.out.printf("%d + %d + %d = %d\n",a,b,c,a+b+c);
	}
	
	public void add(double a, double b, double c){// 3 parameters, float arguments
		System.out.printf("%.2f + %.2f + %.2f = %.2f\n",a,b,c,a+b+c);
	}
	
}
class Child extends Adders{
	public void add(double a, double b) { // 2 parameters, float arguments, in child class
		System.out.printf("%.2f + %.2f = %.2f\n",a,b,a+b);
	}
}

public class OverloadingMain {

	public static void main(String[] args) {
		
		Adders obj = new Adders();
		Child obj1 = new Child();
		obj.add(4, 6);
		obj.add(4, 4, 2);
		obj.add(3.0, 5.0, 2.0);
		obj1.add(4.0, 6.0); // add() -> overloaded Adders method from Child class
	}
}
		
		/*
		 1. Method overloading is using same method name for more than
		 one method by declaring with different number of arguments or different 
		 data types or both from other methods.
		 2. Method Overloading can be achieved both within same class and 
		 subclasses.
		 3. arguments should be varied based on their count and data types 
		 with same method name.
		 4. Different methods with same name with different return types 
		 will not lead to method overloading.
		 5. difference in number of method parameters and difference in their type
		 only lead to overloading.
		 6. difference in return types will not lead to method overloading.
		 7. Method overloading is also called as compile time polymorphism.
		 */
