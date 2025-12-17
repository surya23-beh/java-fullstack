package myproject_java_package;

public class NestedTry {

	public static void main(String[] args) {
		try {
			String s = null;
			try {
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println("inner catch : String is null " + e);
			}
			}
		catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("inner catch : invalid array index" + e);
			}
		finally {
			System.out.println("always execute");
		}
	}
	

}
