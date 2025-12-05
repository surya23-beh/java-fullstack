package assignment;

import java.util.Scanner;

public class Grade_method {
	public static void printdetails(String a, int b, String c)
	{
		System.out.println("name is :" + a);
		System.out.println("id is :" + b);
		System.out.println("grade is :"+ c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name :");
		String name = sc.next();
		System.out.println("enter student id : ");
		int id = sc.nextInt();
		System.out.println("enter student grade : " );
		String grade = sc.next();	
		
		Grade_method obj = new Grade_method();
		obj.printdetails(name,id,grade);
		
	}

}
