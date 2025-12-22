package assignment;

import java.util.ArrayList;

public class RemoveEvensInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(23);
		num.add(35);
		num.add(38);
		num.add(34);
		num.add(91);
		num.add(54);
		num.add(20);
		System.out.println("numbers are : ");
		for(int i=0;i<=num.size()-1;i++) {
			System.out.println(num.get(i));
		}
		System.out.println("after removing even elements : ");
		for(int i=num.size()-1;i>=0;i--) {
			if(num.get(i)%2==0) {
				num.remove(i);
			}
		}
		for(int i=0;i<=num.size()-1;i++) {
			System.out.println(num.get(i));
		}
	}

}
