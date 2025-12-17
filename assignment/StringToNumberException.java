package assignment;

public class StringToNumberException {

	public static void main(String[] args) {
		String s = "two";
		try {
			int b = Integer.parseInt(s);	
		}
		catch(NumberFormatException e) {
			System.err.println(e);
		}
		finally {
			System.out.println("always executes");
		}

	}

}
