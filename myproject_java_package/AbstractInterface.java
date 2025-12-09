package myproject_java_package;
interface ani{
	void sound();
	void sleep();
}
class Dg implements ani{
	public void sound() {
		System.out.println("itll make sound");
	}
	public void sleep() {
		System.out.println("sleep");
	}
}
public class AbstractInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dg d = new Dg();
		d.sound();
		d.sleep();
	}

}
