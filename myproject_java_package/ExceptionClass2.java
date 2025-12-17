package myproject_java_package;

public class ExceptionClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		try {
			arr[10] = 50;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("exception ran");
		}
	}

}
