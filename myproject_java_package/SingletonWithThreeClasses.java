package myproject_java_package;
class  Single{
	private Single() {}
	private static Single obj = new Single();
	public static Single getInstance() {
		return obj;
	}
	public void message(String  from) {
		System.out.println("called from " + "    "  +  from);
	}
}
class ClassA{
	void useSingleton() {
		Single s = Single.getInstance();
		s.message("Class A");
	}
}
class ClassB{
	void useSingleton() {
		Single s = Single.getInstance();
		s.message("Class B");
	}
}
class ClassC{
	void useSingleton() {
		Single s = Single.getInstance();
		s.message("Class C");
	}
}
public class SingletonWithThreeClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassC c = new ClassC();
		a.useSingleton();
		b.useSingleton();
		c.useSingleton();
	}

}
