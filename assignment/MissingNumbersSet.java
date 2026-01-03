package assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbersSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of youre going to enter: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter " + size +" integers from 1 "
				+ "to 100 to print missing numbers ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		Set<Integer> getting = new HashSet<>();
		Set<Integer> missing = new HashSet<>();
		for(int i=0;i<size;i++) {
			getting.add(arr[i]);
		}
		for(int i=1;i<=100;i++) {
			if(!getting.contains(i)) {
				missing.add(i);
			}
			
		}
		for(int i : missing) {
		System.out.println(i);
		}
	}

}
