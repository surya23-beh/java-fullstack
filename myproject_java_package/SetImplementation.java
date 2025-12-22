package myproject_java_package;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		// add elements
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		System.out.println("Set elements are : " + set);
		// remove
		set.remove(30);
		System.out.println("after removing 30 : "+ set);
		// size
		System.out.println("Size : "+ set.size());
		

	}

}
