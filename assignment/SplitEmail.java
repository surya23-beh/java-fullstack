package assignment;

import java.util.StringTokenizer;

public class SplitEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "user.mail.service@sub.mail.google.co.in";
		String[] parts = str.split("[//.]");
		String og = parts[4]+ "." +parts[5]+ "." +parts[6];
		System.out.println(og);
		System.out.println();
		StringTokenizer str2 = new StringTokenizer("ab+cd-ef*gh","+-*",true);
		while(str2.hasMoreTokens()) {
			System.out.print(str2.nextToken()+",");
		}
		
	}

}
