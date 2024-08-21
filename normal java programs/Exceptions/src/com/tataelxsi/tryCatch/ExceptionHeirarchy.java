package com.tataelxsi.tryCatch;

public class ExceptionHeirarchy {

	public static void main(String[] args) {
		
		try {
//			System.out.println(3/0);
//			
			int arr[] = {1,2,3};
			System.out.println(arr[3]);
			
			String s = null;
			System.out.println(s.length());
			
		}
		catch(ArithmeticException e) {
			System.err.println("Message: "+e.getMessage());
			System.err.println("Can't divide by zero.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Message: "+e.getMessage());
		}
		catch(Exception e) {
			System.err.println("Message: "+e.getMessage());
		}
		finally {
			System.out.println("This is finally block.");
		}
		
		System.out.println("End of execution.");
	}

}
