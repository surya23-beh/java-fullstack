package assignment;

import java.util.Scanner;

public class Divisible_by_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check multiple divisor of 2");
		int num = sc.nextInt();
		if(num%2==0) {// check even or odd
			int count = 0;
			while(num%2==0) {
				num = num/2;
				count++;
				
			}
			System.out.println("number of times that th number is divisible by 2 is : " + count);
			
		}
		else {
			System.out.println("enter even number");
		}
	}

}
