package assignment;

import java.util.HashSet;
import java.util.Set;

public class StudentExamSet {
	public static void main(String[] args) {
		Set<String> Exam1 = new HashSet<>();
		Exam1.add("23e2614"); 
		Exam1.add("23e2615");
		Exam1.add("23e2616");
		Exam1.add("23e2632");
		Exam1.add("23e2633");
		Set<String> Exam2 = new HashSet<>();
		Exam2.add("23e2610");
		Exam2.add("23e2614");
		Exam2.add("23e2632");
		Exam2.add("23e2654");
		Exam2.add("23e2655");
		System.out.println("Student's roll numbers "
				+ "who appeared twice in both the exams are : ");
		for(String i : Exam1) {
			for(String j : Exam2) {
				if(i == j) {
					System.out.println(i);
				}
			}
		}
		
	}	
}
