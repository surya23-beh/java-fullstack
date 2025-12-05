package assignment;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("multiplication table");
		System.out.println("enter a nunmber to get tables");
		int number = sc.nextInt();   
		for(int i=0;i<=10;i++)
		{
			System.out.println(number + "X" + i + "=" + number*i);
			
		}
	}

}
