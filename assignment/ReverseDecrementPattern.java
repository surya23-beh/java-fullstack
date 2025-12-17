package assignment;

public class ReverseDecrementPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(num + " ");
				num++;
			}
			num = 1;
			System.out.println();
		}
	}

}
