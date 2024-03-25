/*
2)Write a Vehicle class with overloaded methods that have a different number of parameters. 
Demonstrate calling these overloaded methods with various numbers of arguments. 
*/

package com.question.second;

class Vehicle
{
	private String name;
	private String model;
	private int noOfWheels;
	private int noOfSeats;
	
	public void displayDetails(String name)
	{
		System.out.println("Name of Vehicle : "+name);
	}
	public void displayDetails(String name, String model)
	{
		System.out.println("Name of Vehicle : "+name+" , Model of Vehicle : "+model);
	}
	public void displayDetails(String name, String model, int noOfWheels )
	{
		System.out.println("Name of Vehicle : "+name+" , Model of Vehicle : "+model+" , Number of Wheels : "+noOfWheels);
	}
	public void displayDetails(String name, int noOfWheels, String model, int noOfSeats)
	{
		System.out.println("Name of Vehicle : "+name+" , Number of Wheels : "+noOfWheels+" , Model of Vehicle : "+model+" , Number of seats : "+noOfSeats);
	}
	
	
}
public class Q2 
{

	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle();
		v.displayDetails("TATA MOTOR");
		v.displayDetails("Range Rover","MHVDGH");
		v.displayDetails("MARUTI SUZUKI","GVDFHY",4);
		v.displayDetails("SPLENDER",2,"MHCCGD",2);
		
	}

}
/*
Name of Vehicle : TATA MOTOR
Name of Vehicle : Range Rover , Model of Vehicle : MHVDGH
Name of Vehicle : MARUTI SUZUKI , Model of Vehicle : GVDFHY , Number of Wheels : 4
Name of Vehicle : SPLENDER , Number of Wheels : 2 , Model of Vehicle : MHCCGD , Number of seats : 2
*/