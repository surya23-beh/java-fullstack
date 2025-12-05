package assignment;

import java.util.Scanner;

class acc{
	String name;
	int accnumber;
	long openingbal;
	acc(String n){
		name = n;
		System.out.println("name is :" + name);}
	acc(String n,int a){
		name = n;
		accnumber = a;
		System.out.println("name is :" + name + "accnumber is :" + accnumber + " ");}
	acc(String n,int a,long o){
		name = n;
		accnumber = a;
		openingbal = o;
		System.out.println("name is :" + name + "accnumber is :" + accnumber + " " + "opening balance is :" + openingbal);}
}
public class BankConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer name:");
		String name = sc.next();
		System.out.println("enter account number:");
		int acc = sc.nextInt();
		System.out.println("enter opening balance :");
		long op = sc.nextLong();
		acc c1 = new acc(name);
		acc c2 = new acc(name,acc);
		acc c3 = new acc(name,acc,op);
		
	}

}
