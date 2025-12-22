package myproject_java_package;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		System.out.println(vec);
		// insert at a specific element
		vec.add(0,1);
		System.out.println(vec);
		// accessing elements
		System.out.println("Element at index 2: " + vec.get(2));
		// updating values
		vec.set(0, 5);
		System.out.println(vec);
		// vector size and capacity
		System.out.println("size :" + vec.size());
		System.out.println("Capacity :" + vec.capacity());
		// checking presence
		System.out.println(" CONTAINS 20  ? :" + vec.contains(20));
		
		
	}

}
