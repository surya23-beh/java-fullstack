package assignment;

import java.util.Scanner;

class DuplicateUserNameException extends Exception{
	DuplicateUserNameException(String s){
		super(s);
	}
}
public class DuplicateUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "suri";
		Scanner sc = new Scanner(System.in);
		System.out.print("enter user name:");
		String name = sc.next();
		try {
			if(name.equals(userName)){
				throw new DuplicateUserNameException("user name already exist!");
			}
			else {
				System.out.print(name + " is accepted");
			}
		}
		catch(DuplicateUserNameException e) {
			System.err.println("error " + e);
		}
	}

}
