package com.tataelxsi.errors;

public class Errors {

	public static void recursive() {
		recursive();
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		try {
			recursive();
		}
		catch(StackOverflowError e)
		{
			System.err.println("Error: "+e);
			System.err.println("hello");
			add(2,3);
		}
		System.out.println("After try and catch");
	}

}
