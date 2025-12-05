package assignment;

import java.util.Scanner;

class Area{
	static float area(float side) {
		return side*side;
	}
	static float area(float b,float l) {
		return b*l;
	}
}
public class AreaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = new Area();
		System.out.println("enter side of square :");
		Scanner sc = new Scanner(System.in);
		float side = sc.nextFloat();
		System.out.println("enter length of rectangle :");
		float  length = sc.nextFloat();
		System.out.println("enter breadth of rectangle :");
		float breadth = sc.nextFloat();
		System.out.println("area of square is:" + a.area(side));
System.out.println("area of rectangle is :" + a.area(length,breadth));
		
	}

}
