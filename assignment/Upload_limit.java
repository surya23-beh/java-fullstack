package assignment;

import java.util.Scanner;

public class Upload_limit {
  public static void main(String[] args) {
		System.out.println("file upload limit");
		Scanner sc = new Scanner(System.in);
		long file_size = 1048576*100;
		System.out.println("enter the file size");
		int size = sc.nextInt();
		String valid = size*1048576>=file_size?"file is not valid":"file is valid";
		System.out.println(valid);
  }
}
