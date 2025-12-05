package myproject_java_package;

import java.util.Scanner;

public class Switch_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		 System.out.println("enter day of the week: ");
		 int dayofweek = sc.nextInt();
		
		 switch(dayofweek) {
		 case 1:
		 {
			 System.out.println("day is monday");
		 }
		 break;
		 
		 case 2:
		 {
			 System.out.println("day is tuesday");
		 }
		 break;
		 case 3:
		 {
			 System.out.println("day is wednesday");
		 }
		 break;
		 case 4:
		 {
			 System.out.println("day is thursday");
			 
		 }
		 break;
		 case 5:
		 {
			 System.out.println("day is friday");
		 }
		 break;
		 case 6:
		 {
			 System.out.println("day is saturday");
		 }
		 break;
		 case 7:
		 {
			 System.out.println("day is sunday");
			 
		 }
		 break;
		 
		 default:
		 {
			 System.out.println("day is nothing");
		 }
		

	}
	}
}


