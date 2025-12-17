package assignment;

import java.util.Scanner;

public class NumberOrString {
	public void check(String a) {
		int count = 0;
		for(int i=0;i<a.length();i++) {
			char c = a.charAt(i);
			if((c >= '0') && (c <= '9')) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("youve entered number");
		}
		else {
			System.out.println("youve entered string");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something:");
		String a = sc.next();
		NumberOrString obj = new NumberOrString();
		obj.check(a);
		
	}

}
