package myproject_java_package;

import java.util.Scanner;

public class Programs_day5 {

	public static void main(String[] args) {
		System.out.println("calculator program");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		System.out.println("enter first number:");
		int num1 = sc.nextInt();
		System.out.println("enter second number:");
		int num2 = sc.nextInt();
		boolean condition = true;
		while(condition) {
		System.out.println("enter the choice:");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
		{
			System.out.println("addition is : " + (num1+num2));
		}
		break;
		case 2:
		{
			System.out.println("subtraction is : " + (num1-num2));
			
		}
		break;
		case 3:
		{
			System.out.println("multiplication is : " + num1*num2);
		}
		break;
		case 4:
		{
			System.out.println("division is : " + num1/num2);
		}
		break;
		default:
		{
			System.out.println("enter right choice");
		}
		}
		System.out.println("again goto choice block :");
		String ch = sc.next();
		if(ch.equals("yes")) {
			condition = true;
		}
		else {
			condition = false;
			System.out.println("program exited");
			
		}
		}
		
	}
	}