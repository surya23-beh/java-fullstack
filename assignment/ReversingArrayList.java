package assignment;

import java.util.ArrayList;

public class ReversingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		System.out.println("numbers in straight order :");
		for(int i=0;i<=num.size()-1;i++) {
			System.out.println(num.get(i));
		}
		System.out.println("numbers in reverse order :");
		for(int i=num.size()-1;i>=0;i--) {
			System.out.println(num.get(i));
		}
		
	}

}
