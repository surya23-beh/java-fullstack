package assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of arr1: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array elements :");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the size of arr2: ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("enter array elements :");
		for(int i=0;i<size;i++) {
			arr2[i] = sc.nextInt();
		}
		Set<Integer> common = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i]==arr2[j]) {
					common.add(arr[i]);
				}
			}
		}
		System.out.println("common elements are :");
		System.out.println(common);
	}

}
