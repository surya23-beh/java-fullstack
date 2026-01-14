package assignment;

public class StringS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xAEIUO";
		int n = s.length();
		String Str = "";
		int endindex = n-1;
		while(endindex>=0) {
			if(s.charAt(endindex)=='a' ||s.charAt(endindex)=='e' ||s.charAt(endindex)=='i'
					||s.charAt(endindex)=='o' ||s.charAt(endindex)=='u' ||s.charAt(endindex)=='A'
					||s.charAt(endindex)=='E' || s.charAt(endindex)=='I' ||s.charAt(endindex)=='O'
					||s.charAt(endindex)=='U') {
				endindex--;
			}
			else {
				break;
			}
		}
		for(int i=0;i<endindex+1;i++) {
			Str += s.charAt(i);
		}
		System.out.println("output :" + Str);
	}
	}


