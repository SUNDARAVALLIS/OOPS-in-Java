package com.tataelxsi.exceptions;

public class RuntimeExceptions {
	
	public static void main(String args[]) {
		
//		try {
//			System.out.println(3/0);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Exception: "+e.getMessage());
//			System.out.println("Cant divide by zero");
//		}
		
		try {
			int arr[] = {1,2,3};
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: "+e.getMessage());
		}
		finally {
			System.out.println("At finally block.");
		}
		System.out.println("End of Execution");
	}
}
