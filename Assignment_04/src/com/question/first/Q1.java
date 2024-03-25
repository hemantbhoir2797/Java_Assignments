/*
1) Build a class Student which contains details about the Student and compile and run its  
instance. 
*/
package com.question.first;

import java.util.Scanner;

class Student
{
	private String name;
	private int rn;
	private String shirtColor;
	
	public void acceptDetails()
	{
		try( Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter name of the student: ");
		    this.name = sc.nextLine();
		    System.out.println("Enter roll number of the student: ");
		    this.rn = sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter Shirt color of the student: ");
		    this.shirtColor = sc.nextLine();
		    
		}	
		
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+this.name+"  Roll number : "+this.rn+"  Shirt Color : "+this.shirtColor); 
	}
	
}
public class Q1 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		
		s.acceptDetails();
		
		s.displayDetails();
		
	}

}

/* output:
    Enter name of the student: 
	Hemant
	Enter roll number of the student: 
	111
	Enter Shirt color of the student: 
	Black
	Name : Hemant  Roll number : 111  Shirt Color : Black
*/ 
