package assignment;

import java.util.Scanner;

public class NeonCheck {
	public void neon(int n) {
		int sq = n*n;
		int sum = 0;
		while(sq>0) {
			int i = sq%10;
			sum = sum + i;
			sq = sq/10;
		}
		if(n==sum) {
			System.out.println("its a neon number");
		}
		else {
			System.out.println("its not a neon number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check it is a neon number or not");
		int num = sc.nextInt();
		NeonCheck obj = new NeonCheck();
		obj.neon(num);
	}

}
