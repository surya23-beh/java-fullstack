package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchinElementInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element to search:");
		int elm = sc.nextInt();
		for(int i=0;i<=num.size()-1;i++) {
			if(elm==num.get(i)) {
				System.out.println("element found in the :" + i+ " index");
			}
			
		}
		
	}

}
