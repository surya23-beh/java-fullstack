package myproject_java_package;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("suri");
		names.add("poori");
		System.out.println("the list :" + names);
		names.add(1,"lorry");
		System.out.println("new list :" + names);
		// access element
		System.out.println("the list :" + names.get(2));
		//update element
		names.set(1, "dori");
		System.out.println("the list :" + names);
		//remove
		names.remove(2);
		System.out.println("new list :" + names);
		//size
		System.out.println("the size :" + names.size());
		for(String s: names) {
			System.out.println(s);
		}
	}

}
