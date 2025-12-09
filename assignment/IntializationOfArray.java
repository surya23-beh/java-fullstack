package assignment;

import java.util.Scanner;

public class IntializationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter " + size + " " + "elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("entered array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println( arr[i]);
		}
	}

}
