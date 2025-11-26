package myproject_java_package;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// implicit type casting
		byte b=10;
		short s=b;
		int i=s;
//		long l=i;
//		float f=l;
		double d=i;
		
		System.out.println("byte"+" " + b);
		System.out.println("short"+ " " +s);
		System.out.println("int"+ " " +i);
//		System.out.println("long"+ " " +l);
//		System.out.println("float"+ " " +f);
		System.out.println("double"+ " " +d);
		
		
		//explicit type casting 
		
		double db = 2545.76;
		float fl = (float)db;
		long lg = (long)fl;
		int it = (int)db;
		short st =  (short)it;
		byte bt = (byte)st;
		
		System.out.println("byte"+" " + bt);
		System.out.println("short"+ " " +st);
		System.out.println("int"+ " " +it);
		System.out.println("long"+ " " +lg);
		System.out.println("float"+ " " +fl);
		System.out.println("double"+ " " +db);
		
	}

}
