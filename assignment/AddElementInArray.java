package assignment;
import java.util.Scanner;
public class AddElementInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size+1];
		System.out.println("enter" + size + "elements");
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element to add with the existing array");
		int newElem = sc.nextInt();
		System.out.println("new array is:");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.println(arr[i]);
			}
			else {
				System.out.println(arr[i]+newElem);
			}
		}
	}

}
