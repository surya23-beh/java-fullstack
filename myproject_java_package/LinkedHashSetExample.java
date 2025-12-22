package myproject_java_package;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> num = new LinkedHashSet<>();
		num.add("red");
		num.add("orange");
		num.add("purple");
		num.add("gold");
		num.add("black");
		System.out.println(num);
		// operations
		System.out.println("size of the set :" + num.size());
		System.out.println("existance checking : "+ num.contains("red"));
		System.out.println("removing element orange :" + num.remove("orange"));
		System.out.println(num);
		// Iteration 
		for(String value : num) {
			System.out.println(value);
		}
		
	}

}
