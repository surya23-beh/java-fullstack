package assignment;

import java.util.Scanner;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String s) {
        super(s);
    }
}
public class MinimumWageCheck{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter salary");
	int sal = sc.nextInt();
	try {
		if(sal<15000) {
			throw new InvalidSalaryException("salary is not enough");
		}
		else {
			System.out.println("salary accepted");
		}
	}
	catch(InvalidSalaryException e) {
		System.err.println(e);
	}
}
}


