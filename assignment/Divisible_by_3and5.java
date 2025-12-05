package assignment;

public class Divisible_by_3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("checking numbers divisible by 3 and 5");
		for(int i=1;i<=150;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}

}
