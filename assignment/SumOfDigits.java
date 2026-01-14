package assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4444;
		int sum = 0;
		while(num>1) {
			int d = num%10;
			sum += d;
			num /= 10;
		}
		System.out.println("sum of digits :" + sum);
	}

}
