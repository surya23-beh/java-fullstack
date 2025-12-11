package myproject_java_package;

import java.util.Scanner;

public class EqualizerArray {
	 public static boolean arrayEqualizer(int[] arr,int[] arr2) {
			if(arr.length!=arr2.length) {
				return false;
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=arr2[i]) {
					return false;
				}
			}
			return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the arrayA:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter" + size + "elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the size of the arrayB:");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.println("enter" + size2 + "elements");
		for(int j=0;j<arr2.length;j++) {
			arr2[j] = sc.nextInt();
		}
		EqualizerArray e = new EqualizerArray();
		System.out.println(e.arrayEqualizer(arr, arr2));
	}}
	
