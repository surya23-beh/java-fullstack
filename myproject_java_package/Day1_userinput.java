package myproject_java_package;

import java.util.Scanner;

public class Day1_userinput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE INTEGER:");
		int i = sc.nextInt();
		System.out.println("INTEGER IS :" + i);
		
		
		System.out.println("ENTER THE FLOAT");
		float f = sc.nextFloat();
		System.out.println("FLOAT IS :"+f);
		
		System.out.println("ENTER THE DOUBLE");
		double d = sc.nextDouble();
		System.out.println("DOUBLE IS :"+ d);
		
		System.out.println("ENTER THE SHORT");
		short s = sc.nextShort();
		System.out.println("SHORT IS :"+ s);
		
		System.out.println("ENTER THE CHAR");
		 char c = sc.next().charAt(0);
		System.out.println("CHARACTER IS :"+c);
		
		System.out.println("ENTER THE LONG");
		long l = sc.nextLong();
		System.out.println("long is :" +l);
		
		System.out.println("ENTER THE BOOLEAN");
		boolean b = sc.nextBoolean();
		System.out.println("boolean is:"+ b);
		
		System.out.println("ENTER THE BYTE");
		byte by = sc.nextByte();
		System.out.println("byte is :"+ by);
		
		 
		
		
	}
	
	

}
