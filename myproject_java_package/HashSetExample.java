package myproject_java_package;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> fru = new HashSet<>();
		fru.add("Apple");
		fru.add("Banana");
		fru.add("Mango");
		fru.add("Grape");
		System.out.println(fru);
		System.out.println("size of the set :" + fru.size());
		System.out.println("existance checking : "+ fru.contains("Apple"));
		System.out.println("removing element orange :" + fru.remove("Mango"));
		System.out.println(fru);
		
		for(String value : fru) {
			System.out.println(value);
		}
	}

}
