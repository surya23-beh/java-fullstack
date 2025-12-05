package assignment;
import java.util.Scanner;
public class Atm_withdrawl {
	public static int balance() {
		int bal = 23780;
		return bal;}
	public static void withdrawl(int amt) {
		int limit = 2000;
		Atm_withdrawl obj = new Atm_withdrawl();
		int withdrawl_bal = obj.balance()-amt;
		if(withdrawl_bal<limit) {
			System.out.println("withdrawn amount reached limit");} 
		else {
			System.out.println("withdrawn successfull");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to baba bank");
		System.out.println("1. check balance");
		System.out.println("2. withdrawl");
		System.out.println("enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Atm_withdrawl obj2 = new Atm_withdrawl();
		switch(choice) {
		case 1:{
			int balance = obj2.balance();
			System.out.println(balance);
			break;}
		case 2: {
			System.out.println("enter withdrawl amout");
			int amount = sc.nextInt();
			obj2.withdrawl(amount);
			break;}
		default :{
			System.out.println("enter existing choice");
		}
		}
		
		
	}

}
