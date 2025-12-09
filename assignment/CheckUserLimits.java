package assignment;

import java.util.Scanner;

class UserLimit{
	static final int limit = 34;
	static void checklimit(int l){
		if(l>limit) {
			System.out.println("limit reached");
		}
		else {
			System.out.println("users taken");
		}
	}
	
}
public class CheckUserLimits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of users");
		int numb = sc.nextInt();
		UserLimit u = new UserLimit();
		u.checklimit(numb);
	}

}
