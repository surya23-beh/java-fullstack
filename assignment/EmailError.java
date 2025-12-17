package assignment;

import java.util.Scanner;

class EmailException extends Exception{
	EmailException(String s){
		super(s);
	}
}
public class EmailError {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your email : ");
		String email = sc.next();
		int count = 0;
		try {
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					count++;
				}
			}
			if(count>0) {
				System.out.println("email validated");
			}
			else {
				throw new EmailException("email must contain '@'");
			}
			
		}
		catch(EmailException e) {
			System.err.println("error occured " + e);
		}
		}
	}
	
	


