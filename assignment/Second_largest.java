package assignment;

import java.util.Scanner;

public class Second_largest {
	public static int seclargest(int a,int b,int c) {
		int res;
		if((a>b && a<c) || (a>c && a<b))
		{
			res = a;
		}
		else if((b>a && b<c) || (b>c && b<a)) {
			res = b;
		}
		else {
			res = c;
		}
		return res;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("finding second largest number");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  first integer");
		int num1 = sc.nextInt();
		System.out.println("enter second integer");
		int num2 = sc.nextInt();
		System.out.println("enter third integer");
		int num3 = sc.nextInt();
		Second_largest obj = new Second_largest();
		int result = obj.seclargest(num1, num2, num3);
		System.out.println("second largest is : "+ result);
		
		
	}

}
