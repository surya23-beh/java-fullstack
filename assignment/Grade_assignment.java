package assignment;

import java.util.Scanner;

public class Grade_assignment {
	public static String grade(int a) {
		
		return(a>=90)?"A":
			  (a>=80)?"B":
			  (a>=70)?"C":
			  (a>=60)?"D":
				      "F";
			 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter student's mark :");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		Grade_assignment obj = new Grade_assignment();
		String res = obj.grade(marks);
		System.out.println("grade is : "+res);
	}

}
