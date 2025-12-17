package myproject_java_package;

public class StringBufferHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		//append
		sb.append(" Welcome guys");
		System.out.println("appended result : " + sb);
		// insert
		sb.insert(6,"hi ");
		System.out.println("inserted result : " + sb);
		// replace
		sb.replace(0, 6, "ina bha lingesa ");
		System.out.println("replaced result : " +sb);
		// delete
		sb.delete(0, 7);
		System.out.println("deleted result : " + sb); 
		// reverse
		sb.reverse();
		System.out.println("reversed result : " + sb);
		// capacity
		System.out.println("capacity result : " + sb.capacity());
		System.out.println("length result : " + sb.length());
	}

}
