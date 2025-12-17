package myproject_java_package;
class InvalidMarksException extends Exception{
	InvalidMarksException(String s){
		super(s);
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 120;
		try {
			if(marks<0 || marks>00) {
				throw new InvalidMarksException("marks should between 0 and 100");
			}
			else {
				System.out.println("marks is : " + marks);
			}
		}
		catch(InvalidMarksException e) {
			System.out.println(e);
		}
	}

}
