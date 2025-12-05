package myproject_java_package;

class Name{
private String name; 
private int age;
private int id;
	public String getName() {
		return name;}
	public int getId() {
		return id;}
	public int getAge() {
		return age;}
	public void setName(String newName) {
		this.name = newName;}
	public void setAge(int newAge) {	
		this.age = newAge;}
	public void assignId(int id) {
		this.id = id;}
}
public class Encapsulation_sample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		variables - private
//		getter - methods to access 
//		setter - methods to modify
		Name obj = new Name();
		obj.setName("suri");
		obj.setName("yuvraj");
		obj.setAge(20);
		obj.assignId(1);
		System.out.println("name is : " + obj.getName());
		System.out.println("name is : " + obj.getName());
		System.out.println("age is : " + obj.getAge());
		System.out.println("id is : " + obj.getId());
		
		
	}

}
