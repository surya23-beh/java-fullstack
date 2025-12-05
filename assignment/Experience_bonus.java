package assignment;

import java.util.Scanner;

public class Experience_bonus {
	public static float bonuspay(int ex) {
		int salary = 20000;
		int bonus;
		if(ex > 5) {
		bonus = salary*20/100;	
		}
		else {
			bonus = salary*10/100;
		}
		return (salary+bonus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your experience");
		Scanner sc = new Scanner(System.in);
		int exp = sc.nextInt();
		Experience_bonus obj = new Experience_bonus();
		float res = obj.bonuspay(exp);
		System.out.println("your take home salary is : " +  res  ) ;
		
		
		
	}

}
