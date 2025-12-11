package assignment;

import java.util.Scanner;

public class AddElementSpecificPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size+1];
		int temp[] = new int[size+2];
		System.out.println("enter" + size + "elements");
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element to add with the existing array");
		int newElem = sc.nextInt();
		System.out.println("enter the position to store");
		int pos = sc.nextInt()-1;
		System.out.println("new array");
		for(int i=0;i<arr.length;i++) {
			if(i<pos) {
				temp[i] = arr[i];}
			else if(i==pos) {
				temp[i] = newElem;}
			else if(i>pos) {
				temp[i] = arr[i-1];
			}
			System.out.println(temp[i]);
		}
		
	}
}
