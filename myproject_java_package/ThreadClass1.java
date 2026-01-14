package myproject_java_package;

public class ThreadClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			final int threadnumber = i;
			//thread created
			Thread t = new Thread(()->{
				System.out.println("Thread is running " + threadnumber +" is running");
			});
			
			t.start();// thread started
			try {
				t.join();// wait for current thread to finish
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
