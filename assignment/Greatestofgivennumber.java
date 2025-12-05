package assignment;

import java.util.Scanner;

public class Greatestofgivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("greatest of given number");
		System.out.println("enter num 1:");
		int num = sc.nextInt();
		System.out.println("enter num 2:");
		int num2 = sc.nextInt();
		if(num>num2) {
			System.out.println("greatest is : " + num); 
		}
		else
		{
			System.out.println("greatest is : " + num2);
		}
	}

}
