package myproject_java_package;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type 1 Default delimiter (Space)");
		StringTokenizer str1 =  new StringTokenizer("java python c++");
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
		}
		System.out.println("Type 2 Custom delimiter (comma)");
		StringTokenizer str2 = new StringTokenizer("a,b,c,d,e",",");
		while(str2.hasMoreTokens()) {
			System.out.println(str2.nextToken());
		}
		System.out.println("Type 3 Custom delimiter + returnDelims");
		StringTokenizer str3 = new StringTokenizer("a,b,c:d:e",",:", true);
		while(str3.hasMoreTokens()) {
			System.out.println(str3.nextToken());
		}
	}

}
