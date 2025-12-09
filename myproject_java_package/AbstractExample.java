package myproject_java_package;

abstract class animal{
	abstract void sound();//abstract method
	void sleep() {// non-abstract method
		System.out.println("sleep");
	}
	animal(){
		System.out.println("this is constructor abstract method");
	}
}
public class AbstractExample extends animal {
	void sound() {
		System.out.println("itll make sound");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample obj = new AbstractExample();
		obj.sleep();
		obj.sound();
	}

}
																																																				