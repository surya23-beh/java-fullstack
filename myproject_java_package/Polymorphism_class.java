package myproject_java_package;

class food{
	void eat(String breakfast) {
		System.out.println("breakfast is :" + breakfast);
	}
	void eat(String lunch, int time) {
		System.out.println("lunch is :" + lunch + "time :" + time);
	}
	void eat(String snacks, double quantity) {
		System.out.println("snack is :" + snacks + "quantity :" + quantity);
	}
	void eat(String dinner, boolean islight) {
		if(islight) {
		System.out.println("dinner is :" + dinner + "(lightmeal)");}
		else {
			System.out.println("dinner is :" + dinner + "(heavymeal)");
		}
	}
}
public class Polymorphism_class {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food obj = new food();
		obj.eat("idly");
		obj.eat("biriyani",2);
		obj.eat("tea",30);
		obj.eat("chappathi" ,true);
	}

}
