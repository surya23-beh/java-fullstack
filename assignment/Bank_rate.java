package assignment;

import java.util.Scanner;

public class Bank_rate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******bank interest rate*******");
		System.out.println("enter account balance");
		Scanner sc = new Scanner(System.in);
		long balance = sc.nextLong();
		float rate = (float)4.65/100;
		long final_balance = (long) (balance + (balance*(float)rate));
		System.out.println("final balance is : "+ final_balance);
	}

}
