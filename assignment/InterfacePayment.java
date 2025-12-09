package assignment;
import java.util.Scanner;
interface payment{
	void pay(double p);}
class CreditCard implements payment{
	public void pay(double p) {
		System.out.println("credit card vazhiyil perapatta thogai rupai :" + p);}}
class Upi implements payment{
	public void pay(double p) {
		System.out.println("perapatta upi thogai rupai :" + p);}}
public class InterfacePayment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CreditCard card = new CreditCard();
		Upi u = new Upi();
		System.out.println("1. credit card payment");
		System.out.println("2. upi payment");
		System.out.println("enter the choice");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("enter amount to be paid");
			long amt = sc.nextLong();
			System.out.println("enter bank accnumber : ");
			long accnumber = sc.nextLong();
			if(accnumber == 9514382) {
				card.pay(accnumber);}
			else {
				System.out.println("wrong account number");}}break;
		case 2:{
			System.out.println("enter amount to be paid");
			long amt2 = sc.nextLong();
			System.out.println("enter upi id");
			String upiid = sc.next();
			u.pay(amt2);}break;
		default:{
			System.out.println("wrong choice");}}}
}
