package myproject_java_package;
class Animals{
	void sound() {
		System.out.println("itll make sound");
	}
}
class Dogs extends Animals{
	@Override
	void sound() {
		super.sound();
		System.out.println("itll also make sound");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d = new Dogs();
		d.sound();

	}

}
