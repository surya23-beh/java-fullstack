package assignment;
import java.util.Scanner;
class Shape{
	String color = "";}
class Circle extends Shape{
	 public int area(int s) {
		 int area = s*s;
		 return area;}}
class Rectangle extends Shape{
	public int area2(int l,int b) {
		int ar = l*b;
		return ar;}}
public class ShapeHierarchialInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		System.out.println("enter side of square to get area :" );
		int area = sc.nextInt();
		System.out.println("enter length of rectangle :");
		int l = sc.nextInt();
		System.out.println("enter width of rectangle :");
		int w = sc.nextInt();
		int sqarea = c.area(area);
		int recarea = r.area2(l, w);
		c.color = "red";
		r.color = "blue";
		System.out.println("area of " + c.color + " square is : " + sqarea);
		System.out.println("area of " + r.color + " rectangle is :" + recarea);
		
	}

}
