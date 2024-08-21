package com.tataelxsi.interfacings;

public class Polymorphism {
	public static void main(String args[]) {
		Method obj=new Method();
		obj.min(5,6,8);
		obj.min(10,11);
	}

}
class Method{
	void min(int a,int b) {
		if(a<b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
	void min(int a,int b,int c) {//method overloading
		if(a<b &&a<c) {
			System.out.println(a);
		}else if(a>b &&b<c){
			System.out.println(b);
			
		}else {
			System.out.println(c);
		}
	}	
}
