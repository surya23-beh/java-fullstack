package myproject_java_package;
class SibgletonImplementation{
	private SibgletonImplementation() {}
	private static SibgletonImplementation obj = new SibgletonImplementation();
	public static SibgletonImplementation getInstance() {
		return obj;
	}
	public void showMessage() {
		System.out.println("Singleton class is working");
	}
}
class Entry{
	public void useShowMessage() {
		SibgletonImplementation obj = SibgletonImplementation.getInstance();
		obj.showMessage();
	}
}
public class SingletonClass {

	public static void main(String[] args) {
		SibgletonImplementation  obj = SibgletonImplementation.getInstance();
		obj.showMessage();

	}

}
