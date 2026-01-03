package assignment;

import java.util.Scanner;

public class Isnum {
	public static boolean checkCharacter(char s) {
		if(s>='0' && s<='9') {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string : ");
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i)+ " -> " + 
		checkCharacter(str.charAt(i)));
		}
		
	}

}

