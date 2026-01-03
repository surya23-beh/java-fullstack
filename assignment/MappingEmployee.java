package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MappingEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int size = sc.nextInt();
		String[] name = new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter employee name :" + i);
			name[i] = sc.next();
		}
		System.out.println("enter employee names are :");
		for(String i : name) {
			System.out.println(i);
		}
		String[] dept = new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter department name :" + i);
			dept[i] = sc.next();
		}
		System.out.println("departments are : ");
		for(String i : dept) {
			System.out.println(i);
		}
		Map<String,String> Emp = new HashMap<>();
		Emp.put(name[0], dept[0]);
		Emp.put(name[1], dept[1]);
		Emp.put(name[2], dept[2]);
		System.out.println("\nEmployee - Department Mapping:");
		for (Map.Entry<String, String> entry : Emp.entrySet()) {
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		
	}

}
