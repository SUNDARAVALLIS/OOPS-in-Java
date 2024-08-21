package com.tataelxsi.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionClass {

	public static void main(String[] args) {
		
//		try {
//			Class.forName("Sample"); //forName() -> loads class "Sample" in class loader
//			// "Sample" class is not declared anywhere
//		}
//		catch(ClassNotFoundException e) {
//			System.out.println("Exception: "+e.getMessage()+" class is not declared.");
//		}
//		finally {
//			System.out.println("At finally block");
//		}
		
		
		try {  
	            File file = new File("nonexistent_file.txt");  
	            Scanner scanner = new Scanner(file);  
		 }
		 catch (FileNotFoundException e) {  
	            System.out.println("File not found: " + e.getMessage());  
	     }
		finally {
			System.out.println("At finally block");
		}
		
		System.out.println("End of Execution");
	}

}

