package assignment;

import java.util.Scanner;

public class Vote_method {
	public static String vote(int a)
	{
		String res = a>=18?"eligible to vote":"not eligible to vote";
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your age :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();	
		Vote_method obj = new Vote_method();
		String result = obj.vote(age);
		System.out.println(result);
	}

}
