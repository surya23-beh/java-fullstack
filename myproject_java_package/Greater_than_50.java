package myproject_java_package;

import java.util.Scanner;

public class Greater_than_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = sc.nextInt();
		System.out.println("enter second number:");
		int num2 = sc.nextInt();
		int result = num1+num2;
		if(result>50) {
			System.out.println("greater than 50");
		}
		else if(result>=10 && result<=20) {
			System.out.println("result is between 10 and 20");
		}
		else if(result>=21 && result<=30) {
			System.out.println("result is between 21and 30");
		}
		else if(result>=31 && result<=40) {
			System.out.println("result is between 31 and 40");
		}
		else {
			System.out.println("result is between 41 and 50");
		}
		
		for(int i=2;i<=7;i++) {
			if(result%i==0) {
				System.out.println("it is divisible by" + i);
			}
		}
		System.out.println("reversing the given user input");
		int rev = 0;
		while(num1>0) {
			int digit = num1%10;
			rev = rev*10+digit;
			num1 = num1/10;
		}
		System.out.println("reversed num1 is : "+ rev);
		int rev2 = 0;
		while(num2>0) {
			int digit = num2%10;
			rev2= rev2*10+digit;
			num2 = num2/10;
		}
		System.out.println("reversed num2 is : "+ rev2);
		
	}

}
