package assignment;

import java.util.ArrayList;

public class DuplicatesInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(23);
		num.add(10);
		num.add(38);
		num.add(34);
		num.add(34);
		num.add(54);
		num.add(38);
		System.out.println("numbers are : ");
		for(int i=0;i<=num.size()-1;i++) {
			System.out.println(num.get(i));
		}
		System.out.println("after removing duplicate elements : ");
		for(int i=0;i<=num.size()-1;i++) {
			for(int j=i+1;j<=num.size()-1;j++) {
				if(num.get(i).equals(num.get(j))) {
					System.out.println(num.get(i));
				}
			}
		}
	}

}
	


