package assignment;

import java.util.Scanner;

class InvalidTransactionException extends Exception{
	InvalidTransactionException(String s){
		super(s);
	}
}
public class TransactionException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long limit = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		long amt = sc.nextLong();
		try {
			if(amt>limit) {
				throw new InvalidTransactionException("limit reached");
			}
			else {
				System.out.println("withdrawn successfull");
			}
		}
		catch(InvalidTransactionException e) {
			System.err.println("error occured: " + e);
		}
		finally {
			System.out.println("come again");
		}

	}

}
