package myproject_java_package;

public class ThrowExceptionClass {
		public static void checkAge(int a) {
			if(a<18) {
				throw new IllegalArgumentException("access denied"); 
			}
			else {
				System.out.println("access granted");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExceptionClass obj = new ThrowExceptionClass();
		obj.checkAge(9);
		
	}

}
