package assignment;

import java.util.Scanner;

public class MethodOverloadingAdd {
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	static float add(float a, float b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingAdd obj = new MethodOverloadingAdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = sc.nextInt();
		System.out.println("enter second number:");
		int num2 = sc.nextInt();
		System.out.println("enter third number:");
		int num3 = sc.nextInt();
		int  res1  =  obj.add(num1,num2);
		System.out.println("num1 + num2 is :"+   res1);
		int res2 = obj.add(num1,num2,num3);
		System.out.println("num1 + num2 + num3 is :"+ res2);
		System.out.println("enter first float value:");
		float f1 = sc.nextFloat();
		System.out.println("enter second float value:");
		float f2 = sc.nextFloat();
		float res3 = obj.add(f1,f2);
		System.out.println("addition of two float value is :"+ res3);
		
		
	}

}
