package myproject_java_package;

import java.util.Scanner;

public class Control_statements {
	public static void main(String[] args)
	{
		
		
//		 simple if statement
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter your age");
		 int age = sc.nextInt();
		 if(age>=18) 
		 {
			 System.out.println("im eligible to vote");
		 }
		 if(age<18)
		 {
			 System.out.println("im not eligible to vote");
			 
		 }
		 
		 // if else statements
		 
		 
		 System.out.println("enter student's marks");
		 int mark = sc.nextInt();
		 
		 if(mark>=40) 
		 {
			 System.out.println("Student is pass");
		 }
		 else
		 {
			 System.out.println("Student is fail");
		 }
		 
		 
		 // if else if else
		 
		 if(mark>=80)
		 {
			 System.out.println("student is pass with distinction");
			 
		 }
		 else if(mark>=70 && mark<=79)
		 {
			 System.out.println("student is pass with grade A");
		 }
		 else if(mark>=60 && mark<=69)
		 {
			 System.out.println("student is pass with grade B");
		 }
		 else if(mark>=40 && mark<=59)
		 {
			 System.out.println("student is pass with grade C");
		 }
		 else 
		 {
			 System.out.println("student is very worst");
		 }
		 
		 // nested if 
		 System.out.println("enter your nationality");
		 String nationality = sc.next();
		 
		 
		 if(nationality.equals("indian"))
		 {
			 if(age>=18)
			 {
				 System.out.println("youre indian and you got eligible to vote");
			 }
		 }
		
		 
		 
		 
				 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}


