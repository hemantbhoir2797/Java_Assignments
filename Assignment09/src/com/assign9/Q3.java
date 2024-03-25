/*
3. Write a Java program throws an array index out of bound exception.

*/
package com.assign9;


public class Q3 
{
	public static void arraySIzeCheck(int arr[])
	{
		int n = arr.length;
		try
		{
			if(n > 3)
				throw new ArrayIndexOutOfBoundsException("Invalid Index");	
			System.out.println("Array Length : "+n);
			
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured....");
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = new int[] {10,20,30,40,50};
	    Q3.arraySIzeCheck(arr);
		

	}

}
