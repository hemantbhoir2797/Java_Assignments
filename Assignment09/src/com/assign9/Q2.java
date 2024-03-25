/*
2. Write a Java program to create a method that takes an 
   integer as a parameter and throws an exception if the number is odd.

*/
package com.assign9;

import java.util.Scanner;

public class Q2 
{
	public static void oddCheck(int num)
	{
		try
		{
			if(num%2 != 0)
				throw new ArithmeticException("Divide by zero");	
			System.out.println("Odd number : "+num);
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("odd number exception");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int num = sc.nextInt();
	    Q2.oddCheck(num);
		

	}

}
