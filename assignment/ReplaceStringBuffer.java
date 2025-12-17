package assignment;

public class ReplaceStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		System.out.println("after replacing :" + sb.replace(0, 5, "vello"));
	}

}
