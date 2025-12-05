package assignment;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to get sum of digits");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0)
		{
			int i = num%10;
			sum = sum+i;
			num = num/10;
		}
		System.out.println("sum of digit is : "+ sum);
	}

}
