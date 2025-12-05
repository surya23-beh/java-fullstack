package myproject_java_package;

import java.util.Scanner;

public class Employee_details {
 
	int empid;
	String name;
	double sal;
	
	public void setDetails(int id, String nm, double salary) 
	{
	 empid = id;
	 name = nm;
	 sal = salary;
	}
	
	public void displayDetails() 
	{
		System.out.println("employee id is :" + empid);
		System.out.println("employee name is :" + name);
		System.out.println("employee salary is : " + sal);
		
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee_details obj = new Employee_details();
		System.out.println(" enter employee id :");
		int id = sc.nextInt();
		
		System.out.println(" enter employee name : " );
		String name = sc.next();
		
		System.out.println("enter employee salary : " );
		double salary = sc.nextDouble();
		
		obj.setDetails(id, name, salary);
		obj.displayDetails();
	}
}
