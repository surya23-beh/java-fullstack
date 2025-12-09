package myproject_java_package;

import java.util.Scanner;

public class TheRealArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println( "enter the array size" );
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println( "enter " + size+ " elements to store");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println( "value is : " + a[i]);
		}
	}

}
