package com.tataelxsi.customException;

import java.util.Scanner;

public class CustomExceptionMain {

	public static void main(String[] args) throws InvalidIntegerException{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int num = sc.nextInt();
		
		if(num==0)
			throw new InvalidIntegerException("Zero is neither positive or negative");
		else if(num<0)
			throw new InvalidIntegerException("Entered integer should not be negative");
		else
			System.out.println("You entered a positive integer");
		
	}

	
}
