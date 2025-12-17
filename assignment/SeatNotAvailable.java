package assignment;

import java.util.Scanner;

class SeatNotAvailableException extends Exception{
	SeatNotAvailableException(String s){
		super(s);
	}
}
public class SeatNotAvailable {

	public static void main(String[] args) {
		String[] str = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter booked or open");
		for(int i=1;i<5;i++) {
			System.out.println("enter for seat no: "+ i);
			str[i] = sc.nextLine();
		}
		try {
			for(int i=1;i<5;i++) {
				if(str[i].equals("booked")) {
					throw new SeatNotAvailableException("seat is already booked:");
				}
				else{
					System.out.println(i + " is open");
				}
			}
		}
		catch(SeatNotAvailableException e) {
			System.err.println("error occured " +e);
		}
	}

}
