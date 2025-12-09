package assignment;
class StaticCounter{
	static int counter = 0;
	StaticCounter(){
		counter++;
	}
}
public class ObjectCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticCounter();
		new StaticCounter();
		new StaticCounter();
		System.out.println("number of objects created is :" + StaticCounter.counter);
		
		 

	}

}
