package myproject_java_package;
public class ExceptionClass {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("error divide by zero " + e);
		}
		finally {
			System.out.println("exception ran");
		}

	}

}
