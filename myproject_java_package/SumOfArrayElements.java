package myproject_java_package;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row:");
		int row = sc.nextInt();
		System.out.println("enter column:");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("enter array elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("sum of array elements : "); 
		for(int i=0;i<row;i++) {
			int sum = 0;
			for(int j=0;j<col;j++) {
				sum += arr[i][j];
				}
			System.out.println("sum of row " + (i+1) + "=" +sum);
			}
		
	}

	}


