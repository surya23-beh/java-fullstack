package assignment;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "  s s s ury a";
		String[] parts = s.split(" ");
		String newStr = parts[0] + parts[1] + parts[2] + parts[3] + parts[4] + parts[5] + parts[6];
		System.out.println(newStr);
	}

}
