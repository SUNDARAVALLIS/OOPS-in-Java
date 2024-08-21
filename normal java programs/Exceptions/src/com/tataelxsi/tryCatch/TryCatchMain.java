package com.tataelxsi.tryCatch;

public class TryCatchMain {
	
	public static void main(String args[]) {
		
		int num;
		num = 0;
	    num = 1;
		try {
			System.out.println(3/num);
			try {
				String s=null;  
				System.out.println(s.length());
			}
			catch(NullPointerException e){
				System.out.println("Exception: "+e.getMessage());
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception: "+e.getMessage());
			System.out.println("Can't divide by zero");
			
			try {
				int arr[]= {1,2,3};
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException obj) {
				System.out.println("Exception: "+obj.getMessage());
			}
		}
		finally {
			System.out.println("This is finally block.");
		}
		
		System.out.println("End of execution.");
	}
}
