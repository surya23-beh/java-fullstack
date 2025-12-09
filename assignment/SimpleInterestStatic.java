package assignment;

import java.util.Scanner;

class Interest{
	static final double intrate = 3.44;
	static void Calculate(long p, int y) {
		double res = p*y*intrate/100;
		System.out.println("simple interest : " + res);
	}
}
public class SimpleInterestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println( "enter the principle amount : " );
		long amt = sc.nextLong();
		System.out.println( "enter the number of years : " );
		int years = sc.nextInt();
		Interest i = new Interest();
		i.Calculate(amt, years);
				

	}

}
