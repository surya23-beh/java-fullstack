package assignment;

import java.util.Scanner;

public class Last_digit {
	public static int last_digit(int a) {
		int lt = a%10;
		return lt;
	}
	
	public static int first_digit(int b) {
		while(b>10) {
			b/=10;
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Last_digit obj = new Last_digit();
		int lastd = obj.last_digit(num);
		System.out.println("last digit is : " + lastd);
		int firstd = obj.first_digit(num);
		System.out.println("first digit is : " + firstd);
		
		
	}

}
