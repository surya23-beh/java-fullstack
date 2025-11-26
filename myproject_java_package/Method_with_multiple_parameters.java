package myproject_java_package;

public class Method_with_multiple_parameters {
public int add(int a,int b,int c)
{
	return a+b-c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_with_multiple_parameters obj = new Method_with_multiple_parameters();
		int res = obj.add(10, 20,40);
		System.out.println("sum is :"+ res);
		
	}

}
