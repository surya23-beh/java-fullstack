package assignment;

import java.util.Scanner;

public class Age_category {
	public static void agecategory(int age) {
		if(age>=4 && age<=10) {
			System.out.println( "person is a child" );
		}
		else if(age>=13 && age<19) {
			System.out.println("person is a teenager");
		}
		else if(age>=21 && age<35) {
			System.out.println("person is an adult");
		}
		else if(age>35 && age<60) {
			System.out.println("person is senior");
		}
		else if(age>60 && age<100) {
			System.out.println("person is super senior");
		}
		else
		{
			System.out.println("you're not a human" );
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("checking age category");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		Age_category obj = new Age_category();
		obj.agecategory(age);
		
	}

}
