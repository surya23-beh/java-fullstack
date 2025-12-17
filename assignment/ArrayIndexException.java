package assignment;

public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int[] arr = new int[5];
		arr[7] = 10;
		System.out.print(arr);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("index error :" + e);
		}
		finally {
			System.out.println("exception ran");
		}
	
	}

}
