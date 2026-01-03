package assignment;

public class SplitMultipleDelimiters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A@B#C$D%E";
		String[] parts = str.split("[@#$%]");
		String og = parts[0] + " "+ parts[1] + " " + parts[2] +
				" "+ parts[3] + " " + parts[4];
		System.out.println(og);
		
	}

}
