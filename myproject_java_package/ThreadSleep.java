package myproject_java_package;
class SleepExample extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("Thread running " + i);
			try {
				Thread.sleep(10000);// pause for 1 sec
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				System.err.println("Thread Interrupted");
			}
		}
	}
	
}
public class ThreadSleep {

	public static void main(String[] args) {
		SleepExample t1 = new SleepExample();
		t1.start();

	}

}
