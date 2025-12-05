package assignment;

import java.util.Scanner;

public class Temp_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter degree in celcius :");
		float temp = sc.nextFloat();
		if((temp>=25.0) && (temp<=30.0)){
			System.out.println("temeperature is hot");
		}
		else if((temp>=15.0) && (temp<=28.0)) {
			System.out.println("temperature is warm");
			
		}
		else if((temp>10.0) && (temp<15.0)) {
			System.out.println("temperature is cold");
		}
		else if(temp>32) {
			System.out.println("too hot");
		}
		else
		{
			System.out.println("too cold");
		}
	}

}
