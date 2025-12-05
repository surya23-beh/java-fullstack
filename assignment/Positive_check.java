package assignment;

import java.util.Scanner;

public class Positive_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("check positive or negative");
		System.out.println("enter a whole number:");
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println(num + "is a positive number");
		}
		if(num<0)
		{
			System.out.println(num + "is a negative number");
		}
	}

}
