package myproject_java_package;

import java.util.Scanner;

public class ReplaceElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter" + size + "elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element to replace :");
		int oldValue = sc.nextInt();
		System.out.println("enter the new element :");
		int newVlaue = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==oldValue) {
				arr[i] = newVlaue;
				break;
			}
		}
		System.out.println("replaced array : ");
		for(int x:arr) {
			System.out.println(x);
		}
		
	}
}

