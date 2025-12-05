package myproject_java_package;
class place{
	void go(String edam) {
		System.out.println("going to " + edam);
	}
	 void go(String place, int time) {
		 System.out.println("going to " + place + "@" + time + "PM");
	 }
	 void go(String place2, String by) {
		 System.out.println("going to " + place2 + "by" + by);
	 }
	 void go(String place, double distance) {
		 System.out.println("going to " + place + "distance" + distance + "KM");
	 }
	 
}
public class Go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		place p = new place();
		p.go("delhi");
		p.go("delhi",9);
		p.go("delhi","flight");
		p.go("delhi",350.8);

	}

}
