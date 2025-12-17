package myproject_java_package;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "hello ";// string variable
		String two = "world";// string variable
		
		
		String sec = new String("hai");// String object
		// length
		int len = one.length();
		System.out.println("length of first string is : " + len);
		// concat
		String joined = one.concat(two);
		System.out.println("joined String is : " + joined);
		// compare two strings
		boolean compare = one.equals(two);
		System.out.println("is one is equal to two : " + compare);
		// using operator
		String exact = new String("heyy");
		System.out.println("String through object :" + exact);
		// replace
		String str1 = "bat ball";
		// replace with c
		System.out.println("replace b with c :" + str1.replace("b", "c"));
		// replace all
		String str2 = "basket ball";
		System.out.println("replacing all : " + str2.replaceAll("basket", "baluket"));
		//upper case
		System.out.println("String to uppper case : "+ one.toUpperCase());
		//lower case
		System.out.println("String to lower case :" + one.toLowerCase());
//		character position
		System.out.println("character position : " + one.charAt(3));
		// substring
		System.out.println("substring from 0 to 3 : " + one.substring(0,3));
	}

}
