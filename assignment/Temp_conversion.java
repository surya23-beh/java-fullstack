package assignment;

import java.util.Scanner;

public class Temp_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****TEMPERATURE CONVERSION******");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the body temperature to store");
	    float temp = sc.nextFloat();
	    System.out.println("entered temp :" + temp);
	    int stored_temp = (int)temp;
	    System.out.println("stored temp : " + stored_temp);
	}

}
