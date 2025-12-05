package assignment;

import java.util.Scanner;

public class Numberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			num = num/10;
			count++;
			
		}
		System.out.println(count);
	}

}
