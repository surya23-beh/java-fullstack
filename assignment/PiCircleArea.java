package assignment;

import java.util.Scanner;

class Area{
	static final double pi = 3.14 ;
	static void calculateArea(double r) {
		double res = pi*r*r;
		System.out.println("Area of circle is : " + res);
	}
	
}
public class PiCircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area r = new Area();
		System.out.println("enter radius of circle :");
		Scanner sc = new Scanner(System.in);
		double db = sc.nextDouble();
		r.calculateArea(db);
	}

}
