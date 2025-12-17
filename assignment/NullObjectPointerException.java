package assignment;

public class NullObjectPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		try {
			int len = s.length();
			System.out.println("length is :" + len);
		}
		catch(NullPointerException e) {
			System.err.println("cant access null values");
			System.err .println(e);
		}
		finally {
			System.out.println("always excecutes");
		}
	}

}
