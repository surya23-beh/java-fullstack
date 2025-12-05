package myproject_java_package;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ENTER THE INTEGERS");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER VALUE OF A");
		int a = sc.nextInt();
		System.out.println("ENTER THE VALUE OF B");
		int b = sc.nextInt();
		//arithmetic operators
		
		System.out.println("addition is :" + (a+b));
		System.out.println("subtraction is :" +(a-b));
		System.out.println("multiplication is :" +(a*b));
		System.out.println("division is : " + (a/b));
		System.out.println("modulus is :" +(a%b));


		//relational operators
		System.out.println("a==b" +(a==b));
		System.out.println("a>b" +(a>b));
		System.out.println("a<b" +(a<b));
		System.out.println("a<=b" +(a<=b));
		System.out.println("a>=b" +(a>=b));
		
		// logical operator
		boolean x=true;
		boolean y=false;
		
		System.out.println("x&&y" + (x&&y));
		System.out.println("x||y" + (x||y));
		System.out.println("!x" + (!x));
		
		//increment and decrement operator
		
		System.out.println("a" + a);
		System.out.println("a++" + (a++));
		System.out.println("after a++" + a);
		
		System.out.println("a" + a);
		System.out.println("++a" + (++a));
		System.out.println("aftre ++a" + a);
		
		System.out.println("a" + a);
		System.out.println("a--" + (a--));
		System.out.println("after a--" + a);
		
		System.out.println("a" + a);
		System.out.println("--a " + (--a));
		System.out.println("after --a" + a);
		
		//assignment operator
		
		System.out.println("additon" + (a+=b));
		System.out.println("sub" + (a-=b));
		System.out.println("multiplication" + (a*=b));
		System.out.println("division" + (a/=b));
		
		//ternary operator   
		
		 int age = 70;
		 String res = age>80?"adult":"child";
		 System.out.println(res);
		
	}

}
