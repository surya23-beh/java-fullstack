package assignment;
import java.util.Scanner;
public class Average_method {
	public static int calculateTotal(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name:");
		String name = sc.next();
		System.out.println("enter student mark1:");
		int m1 = sc.nextInt();
		System.out.println("enter student mark2:");
		int m2 = sc.nextInt();
		System.out.println("enter student mark3:");
		int m3 = sc.nextInt();
		
		Average_method obj = new Average_method();
		int res = obj.calculateTotal(m1, m2, m3);
		
		System.out.println(name+ " 's " +"total is : "+ res);
	}

}
