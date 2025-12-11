package assignment;
import java.util.Scanner;
public class RemoveSpecificElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter" + size + "elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element to remove");
		int elm = sc.nextInt();
		int[] temp1 = new int[size];
		System.out.println("array after removed");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != elm) {
				temp1[i] = arr[i];
				System.out.println(temp1[i]);
			}
		}
	}

}
