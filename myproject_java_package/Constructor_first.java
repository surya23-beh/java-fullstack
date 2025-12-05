package myproject_java_package;

class student{
	String nam;
	int age;
	long Number;
	student(){}
	student(String n){// parameterized constructor
		nam = n;
	}
	student(String n,int a){// constructor overloading
		nam = n;
		age = a;
	}
}
public class Constructor_first {
	String name;
	
	Constructor_first(){// default constructor
		name="raj";
	}
	
	void display() {
		System.out.println("name is :" + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_first obj = new Constructor_first();
		obj.display();
		student s1 = new student("suri",20);
		student s2 = new student("kisshor",20);
		student s3 = new student();
		System.out.println("name is : " + s1.nam +" age is :" + s1.age);
		System.out.println("name is : " + s2.nam +" age is :" + s2.age);
		System.out.println("name is : " + s3.nam +" age is :" + s3.age);
	}

}
