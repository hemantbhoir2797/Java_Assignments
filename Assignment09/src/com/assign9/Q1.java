/*
1. Write a Java program that throws an arithmetic exception 
   and catch it using a try-catch block.
*/   
package com.assign9;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		
		try
		{
			if(num2 == 0)
				throw new ArithmeticException("Divide by zero");
			int result = num1/num2;
			System.out.println("result : "+result);
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Invalid divide by zero");
		}
		

	}

}
