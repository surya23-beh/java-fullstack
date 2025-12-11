package assignment;
import java.util.Scanner; 
public class CountEvenOdd2dArray {                                 
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
		System.out.println("entered array elements"); 
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
				}
			System.out.println();
			}
		int oddCount = 0;
		int evenCount = 0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]%2==0) {
					evenCount++;}
				else {oddCount++;}}
		}
		System.out.println("the number of even element in the array is : " + evenCount);
		System.out.println("the number of odd element in the array is : " + oddCount);
	}

}
