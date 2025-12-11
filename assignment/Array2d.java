package assignment;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row:");
		int row = sc.nextInt();
		System.out.println("enter column:");
		int col = sc.nextInt();
		int[][] arr = new int[row][col]; 
		System.out.println("enter the elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
				}
		}
		System.out.println("entered array is:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		}

}
