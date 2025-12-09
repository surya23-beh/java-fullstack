package myproject_java_package;
class Sampling{
	final int a = 20;// final variable
	final int b;
	Sampling(int value){
		b=value;
		System.out.println("value of b is : " + b);
	}
	void show() {
		System.out.println("max value is : " + a);
	}
}
public class FinalSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sampling obj = new Sampling(50);
		obj.show();
		
	}

}
