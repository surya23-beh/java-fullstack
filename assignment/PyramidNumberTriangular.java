package assignment;

public class PyramidNumberTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;
		for(int i=0;i<=4;i++) {
			for(int s=4;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(num + " ");
				
			}
			num++;
			System.out.println();
		}
	}

}
