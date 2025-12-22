package assignment;

import java.util.ArrayList;

public class ArrayListCreation {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("suri");
		names.add("karnan");
		names.add("mani");
		names.add("kandan");
		names.add("nani");
		System.out.println("NAMES ARE :");
		for(int i=0;i<=names.size()-1;i++) {
			System.out.println(names.get(i));
		}
		

	}

}
