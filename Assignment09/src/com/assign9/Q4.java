/*
4. Write a code for arithmetic exception using one try block & multiple catch block 
   & check which catch block handle that exception.

*/
package com.assign9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) throws Exception
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
			System.out.println("ArithmeticException occured....");
		}
		catch(InputMismatchException ex)
		{
			System.out.println("InputMismatchException occured....");
		}
		catch(RuntimeException ex)
		{
			System.out.println("RuntimeException occured....");
		}
		
		

	}

}
