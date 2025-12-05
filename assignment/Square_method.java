package assignment;

import java.util.Scanner;

public class Square_method {
	public static int square(int a)
	{
		return a*a;
	}
	public static void main(String[] args) {
		System.out.println("enter a number to return its square value");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Square_method obj = new Square_method();
		int res = obj.square(a);
		System.out.println("square value is : "+ res);
	}
}
