package myproject_java_package;

import java.util.Random;

public class Randomnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int dice = rand.nextInt(6)+1;
		System.out.println("you rolled  : "+dice);
	}

}
