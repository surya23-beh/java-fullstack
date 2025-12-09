package myproject_java_package;
class Stud{
	int id;
	String name;
	Stud(int id ,String name){
		this.id = id;
		this.name = name;
	}
	Stud(Stud s){
		this.id = s.id;
		this.name = s.name;
	}
	void display() {
		System.out.println("id is :" + id);
		System.out.println("name is :" + name);
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1 = new Stud(2023,"suri");
		Stud s2 = new Stud(s1);
		s1.display();
		s2.display();

	}

}
