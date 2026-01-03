package assignment;

public class StringToWrapperConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "1234";
		Integer innum = new Integer(num);
		System.out.println("integer value is : "+ innum);
		Double dbnum = new Double(num);
		System.out.println("double value is : "+ dbnum);
		Long lgnum = new Long(num);
		System.out.println("long value is : "+ lgnum);
	}

}
