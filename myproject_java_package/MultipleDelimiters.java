package myproject_java_package;

public class MultipleDelimiters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "apple;banana,orange";
		String[] parts = s1.split(";");
		String og = parts[0] + " " + parts[1];
		String[] parts2 = og.split(",");
		String og2 = parts2[0] + " " + parts2[1];
		System.out.println(og2);
		
		String s2 = ",java,,python,,c++,,";
		String[] parts3 = s2.split(",");
		String og3 = parts3[0] + parts3[1] +" "+parts3[2] +parts3[3] + parts3[4]+" "+parts3[5];
		System.out.println(og3);
		}

}
