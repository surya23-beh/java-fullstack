package assignment;
import java.util.Scanner;
class BankAccount {
	long accnumber = 95143;
	long balance = 30450;
	public long deposit(long d) {
		long finbal = d+balance;
		return finbal;}
	public long withdraw(long w) {
		if(w<balance) {
		long finbal2 = balance-w; 
		return finbal2;}
		else {return -1;}}}
class SavingsAccount extends BankAccount{
	long intrate = 3;
	public long calculateint() {
		long rate = balance + balance*intrate/100;
		return rate;}}
public class InheritBank {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s= new SavingsAccount();
		System.out.println("bank details");
		System.out.println("enter acc number :");
		Scanner sc = new Scanner(System.in);
		long accnumber = sc.nextLong();
		if(accnumber == s.accnumber) {
			System.out.println("1.withdraw");
			System.out.println("2.deposit");
			System.out.println("3.balance(+int rate)");
			System.out.println("enter choice:");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("enter withrawl amount :");
				long withdraw = sc.nextLong();
				long realwithdraw = s.withdraw(withdraw);
				if(withdraw == -1) {System.out.println("limit reached");}
				else {System.out.println("Balance is:" + realwithdraw);}}break;
			case 2:{System.out.println("enter deposit amount :");
				long dep = sc.nextLong();
				long realdep = s.deposit(dep);
				System.out.println("balance is :" + realdep);}break;
			case 3:{
				long intrate = s.calculateint();
				System.out.println("balance is :" + intrate);}break;
			default : {System.out.println("wrong choice");}}}
		else {
			System.out.println("Account number is wrong");
		}
	}

}
