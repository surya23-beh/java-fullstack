package assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array elements :");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		Set<Integer> rm = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			rm.add(arr[i]);
		}
		System.out.println("after removing duplicates : ");
		System.out.println(rm);
	}

}
