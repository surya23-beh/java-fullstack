package assignment;

import java.util.Scanner;

public class PrimeNumbers {
	public boolean isPrime(int num) {
		if(num<0) {
			return false;
		}
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrimeNumbers obj = new PrimeNumbers(); 
		System.out.println("enter a number to get prime numbers from 0 to the number");
		int num = sc.nextInt();
		System.out.println("prime numbers are :");
		for(int i=2;i<num;i++) {
			if(obj.isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
