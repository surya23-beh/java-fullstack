package myproject_java_package;
import java.util.Scanner;
public class SumofArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println( "enter the array size" );
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println( "enter " + size+ " elements to store");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println( "sum of elements is : "+sum);		
	}
}
