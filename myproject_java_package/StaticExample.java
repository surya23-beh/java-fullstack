package myproject_java_package;
class StaticSample{
	 static int counter;//static variable
	StaticSample(){
		counter++;
	}
	static void displayCount() {//static method
		System.out.println("the value is" + ++counter);
	}
}
class Sample{
	static final int a = 10;// static final variable
}
public class StaticExample {
	public static void main(String[] args) {
		StaticSample.counter = 9;
	    new StaticSample();
	    new StaticSample();
		new StaticSample();
		System.out.println(StaticSample.counter);
		System.out.println(Sample.a);
		
	}

}
