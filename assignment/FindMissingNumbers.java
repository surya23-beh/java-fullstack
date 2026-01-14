package assignment;

import java.util.Arrays;

public class FindMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,9,8,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int lastIndex = arr.length-1;
		System.out.println("Missing numbers are :");
		for(int i=1;i<=arr[lastIndex];i++) {
			
		}
		
	}

}
