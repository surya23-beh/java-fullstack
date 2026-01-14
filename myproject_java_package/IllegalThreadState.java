package myproject_java_package;

public class IllegalThreadState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(()->{
			System.out.println("Thread running");
		});
		t.start();// first state
		
		try {
			t.start();// illegal start
			System.out.println("hai");
		}catch(IllegalThreadStateException e) {
			e.printStackTrace();
		}
	}

}
