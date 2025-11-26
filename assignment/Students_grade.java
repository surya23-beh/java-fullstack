package assignment;

import java.util.Scanner;

public class Students_grade {
	public static void main(String[] args) {
		System.out.println("*****student grades******");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name");
		String name = sc.next();
		System.out.println("enter student's mark1");
		int m1 = sc.nextInt();
		System.out.println("enter student's mark2");
		int m2 = sc.nextInt();
		System.out.println("enter student's mark2");
		int m3 = sc.nextInt();
		
		double avg = (double)m1 + (double)m2 + (double)m3 / 3;
		
		int casted_avg = (int)avg;
		 
		System.out.println(name + "'s average mark is : " + avg);
		
		String grade = avg>=90?"A":"B";
		System.out.println("students grade is :" + grade);
	}

}
