package myproject_java_package;

import java.util.Set;
import java.util.TreeSet;

public class TreeSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(60);
		numbers.add(50);
		System.out.println(numbers);
		// checking existence
		System.out.println("checking existence : " + numbers.contains(30));
		// remove
		System.out.println("removing element : " + numbers.remove(30));
		System.out.println(numbers);
		// size of tree set
		System.out.println("size of the numbers are : " + numbers.size());
		// iteration
		System.out.println();
		System.out.println("Iterating set");
		for(int value : numbers) {
			System.out.println(value);
		}
		// clear set
		numbers.clear();
		System.out.println("Tree set after clearing : " + numbers);
		
		
	}

}
