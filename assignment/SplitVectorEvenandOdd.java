package assignment;

import java.util.Vector;

public class SplitVectorEvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec = new Vector<>();
		Vector<Integer> vec_Odd = new Vector<>();
		Vector<Integer> vec_Even = new Vector<>();
		vec.add(34);
		vec.add(33);
		vec.add(52);
		vec.add(83);
		vec.add(11);
		vec.add(87);
		vec.add(89);
		vec.add(88);
		vec.add(92);
		vec.add(56);
		vec.add(12);
		
		for(int i : vec) {
			if(i%2==0) {
				vec_Even.add(i);
			}
			else {
				vec_Odd.add(i);
			}
		}
		System.out.println("Even vectors are :" + vec_Even);
		System.out.println("Odd vectors are : " + vec_Odd);
		}

}
