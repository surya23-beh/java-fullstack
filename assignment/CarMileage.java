package assignment;

import java.util.Scanner;

class car{
	String name;
	float mileage;
	String fuel;
	car(String n){
		name = n;
		System.out.println("name is :" + name);}
	car(String n, float m){
		name = n;
		mileage = m;
		System.out.println("name is :" + name + "mileage is :" + mileage + " ");}
	car(String n, float m,String f){
		fuel = f;
		name = n;
		mileage = m;
		System.out.println("name is :" + name + "mileage is :" + mileage + " " + "fuel is :" + fuel);}
}
public class CarMileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter car name:");
		String name = sc.next();
		System.out.println("enter car fuel type :");
		String fuel = sc.next();
		System.out.println("enter car mileage :");
		float mil = sc.nextFloat();
		car c1 = new car(name);
		car c2 = new car(name,mil);
		car c3 = new car(name,mil,fuel);
		
	}

}
