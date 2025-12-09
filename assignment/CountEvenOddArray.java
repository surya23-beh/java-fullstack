package assignment;

import java.util.Scanner;

public class CountEvenOddArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter" + size + " " + "elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("even elements in the array : " + evenCount);
		System.out.println("odd elements in the array : " + oddCount);
	}

}
