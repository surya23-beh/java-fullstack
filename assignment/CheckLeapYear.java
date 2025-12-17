package assignment;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year to check it leap year or not");
		int yr = sc.nextInt();
		if(yr%4==0) {
			System.out.println("its a leap year");
		}
		else {
			System.out.println("its not a leap year");
		}
	}

}
