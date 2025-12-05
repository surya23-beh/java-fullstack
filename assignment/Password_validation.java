package assignment;

import java.util.Scanner;

public class Password_validation {
	public static void main(String[] args) {
		System.out.println("password validation");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name");
		String user_name = sc.next();
		System.out.println("enter password");
		String password = sc.next();
		boolean havingDigit = false;
		for(int i=0;i<=password.length();i++) {
			char c = password.charAt(i);
			
			if(c>='0' && c<='9') {
				havingDigit = true;
				break;
			}
		}
		if(password.length()>6)
		{
			if(havingDigit) {
				System.out.println("password is validated");
			}
			if(havingDigit == false) {
				System.out.println("password must contain a number");
			}
		}
		if(password.length()<6) {
			System.out.println("password is too short");
		}
		
	}

}
