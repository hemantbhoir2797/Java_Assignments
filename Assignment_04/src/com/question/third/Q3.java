/*
3)Create a class Employee with multiple overloaded methods that have 
  different parameter types (e.g., int, double, String). 
  Demonstrate calling each overloaded method with appropriate arguments
*/

package com.question.third;

class Employee
{
	private String name;
	private String department;
	private int empid;
	private double salary;
	
	public void displayDetails(String name)
	{
		System.out.println("Name of Employee : "+name);
	}
	public void displayDetails(String name, int empid)
	{
		System.out.println("Name of Employee : "+name+" , Id of Employee : "+empid);
	}
	public void displayDetails(String name, int empid, String department )
	{
		System.out.println("Name of Employee : "+name+" , Id of Employee : "+empid+" , Department of Employee : "+department);
	}
	public void displayDetails(String name, int empid, int salary, String department )
	{
		System.out.println("Name of Employee : "+name+" , Id of Employee : "+empid+" , Salary of Employee : "+salary+" , Department of Employee : "+department);
	}
}
public class Q3 
{

	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.displayDetails("ABC");
		emp.displayDetails("XYZ", 11);
		emp.displayDetails("PQR", 22, "TECHNICAL");
		emp.displayDetails("DEF", 33, 80000, "TESTER");
	}

}
/*
Name of Employee : ABC
Name of Employee : XYZ , Id of Employee : 11
Name of Employee : PQR , Id of Employee : 22 , Department of Employee : TECHNICAL
Name of Employee : DEF , Id of Employee : 33 , Salary of Employee : 80000 , Department of Employee : TESTER
*/