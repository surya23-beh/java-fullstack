package assignment;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the array size");
		 int size = sc.nextInt();
		 int[] arr = new int[size];
		 System.out.println("enter " + size + "elements");
		 for(int i=0;i<arr.length;i++) {
			 arr[i] = sc.nextInt();
		 }
		 int small = arr[0];
		 int large = arr[0];
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]<small) {
				  small = arr[i];
			 }
			 else if(arr[i]>large) {
				 large = arr[i];
			 }
		 }
		 System.out.println("largest is : " + large);
		 System.out.println("smallest is ; " + small); 
	}

}
