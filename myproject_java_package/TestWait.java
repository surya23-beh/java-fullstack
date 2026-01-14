package myproject_java_package;

class WaitNotifyExample {
    public void produce() throws InterruptedException {
        synchronized(this) {
            System.out.println("Producer is waiting...");
            wait(); // releases lock and waits
            System.out.println("Producer resumed after notify");
        }
    }

    public void consume() throws InterruptedException {
        synchronized(this) {
            Thread.sleep(2000); // simulate some work
            System.out.println("Consumer notifying...");
            notify(); // wake up waiting thread
        }
    }
}

public class TestWait {
    public static void main(String[] args) throws InterruptedException {
        WaitNotifyExample obj = new WaitNotifyExample();

        Thread t1 = new Thread(() -> {
            try {
                obj.produce();
            } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.consume();
            } catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}