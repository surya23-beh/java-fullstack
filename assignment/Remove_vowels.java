package assignment;

import java.util.Scanner;

public class Remove_vowels {
	public static String rmvowels(String s) {
		String newstr = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				continue;
			}
			 newstr = newstr + s.charAt(i);
		}
		return newstr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("removing vowels");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		Remove_vowels obj = new Remove_vowels();
		String res = obj.rmvowels(s);
		System.out.println("removed vowels : " + res); 
		
		
	}

}
