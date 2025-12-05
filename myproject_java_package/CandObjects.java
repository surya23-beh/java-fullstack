package myproject_java_package;

public class CandObjects {
	String model;
	int year;
	
	void display() {
		System.out.println("model is : " + model +"year is : " + year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CandObjects obj = new CandObjects();
		obj.model = "toyota";
		obj.year = 1999;
		obj.display();

	}

}
