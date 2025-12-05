package assignment;

import java.util.Scanner;

class employee2{
	int id;
	int salary;
	String name;
	employee2(int I){
		id = I;
		System.out.println("id is :" + id);}
	employee2(int I,String N){
		id = I;
		name = N;
		System.out.println("id is :" + id + "name is :" + name + " ");}
	employee2(int I,String N, int S){
		id = I;
		name = N;
		salary = S;
		System.out.println("id is :" + id + "name is :" + name + " " + "salary is :"+salary);}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id :");
		int id = sc.nextInt();
		System.out.println("enter employee name :");
		String name = sc.next();
		System.out.println("enter employee salary :");
		int salary = sc.nextInt();
		employee2 e1 = new employee2(id);
		employee2 e2 = new employee2(id,name);
		employee2 e3 = new employee2(id,name,salary);
		
	}

}
