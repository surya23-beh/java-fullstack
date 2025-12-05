package assignment;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("check even or odd");
		System.out.println("enter an integer:");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num + "is positive");
		}
		else
		{
			System.out.println(num + "is negative");
		}
	}

}
