package myproject_java_package;

import java.util.Scanner;

public class SearchElementsInArray {
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
		System.out.println("enter the element to search");
		int search = sc.nextInt();
		int flag = 0; // 0 - not found , 1 - found
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("element found in the array");
		}
		else {
			System.out.println("element not found in the array");
		}
	}

}
