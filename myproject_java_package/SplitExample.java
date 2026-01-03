package myproject_java_package;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Text2 = "H@i How@ A@re Y@ou";
		String[] parts2 = Text2.split("@");
		String result2 = parts2[0] + parts2[1] + parts2[2] + parts2[3] + parts2[4];
		System.out.println(result2);
		String OGresult = "";
		for(String p : parts2) {
			OGresult = OGresult + p;
		}
		System.out.println(OGresult);
	}

}
