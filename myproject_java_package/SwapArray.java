package myproject_java_package;
public class SwapArray {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before swapping " + a + " " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping " + a + " " + b);
		// array swapping
		int c = 6;
		int d = 7;
		int[] temparr = {c,d};
		System.out.println("before swapping " + c + " " + d);
		c = temparr[1];
		d = temparr[0];
		System.out.println("after swapping " + c + " " + d);
		

	}

}
