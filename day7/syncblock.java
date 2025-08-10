package day7;

public class syncblock { 
	int count = 0; 
	final Object lock = new Object();
	void increment() { 
		synchronized(lock) { 
			count++;
			} 
		}
	public static void main(String[] args) throws InterruptedException { 
		syncblock c = new syncblock(); 
		Thread t1 = new Thread(() -> { for(int i=0; i<1000; i++) c.increment(); }); 
		Thread t2 = new Thread(() -> { for(int i=0; i<1000; i++) c.increment(); });
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count: " + c.count); 
}
}