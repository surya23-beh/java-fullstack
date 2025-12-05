package assignment;

import java.util.Scanner;

public class Divisible_by7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check is it divisible by 7");
		int num = sc.nextInt();
		if(num%7==0) {
			System.out.println("it is divisible");
		}
		else {
			System.out.println("it is not divisible by 7");
		}
	}

}
