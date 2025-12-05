package assignment;

import java.util.Scanner;

public class Shopping_mart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("*****shopping mart*******");
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the total amount");
		  double price = sc.nextDouble();
		  int discount = (int)price*10/100;
		  int final_price = (int)price-discount;
		  System.out.println("final amount is : "+ final_price);
	}

}
