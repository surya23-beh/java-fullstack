package myproject_java_package;



public class Methods {
	public static void sayHello() //method with no parameter
	{
		System.out.println("hai");
	}
	
	public static void greet(String name)
	{
		System.out.println("hello"+ " "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello();// method calling
		greet("suri");
		greet("yuvraj");
	}

}
