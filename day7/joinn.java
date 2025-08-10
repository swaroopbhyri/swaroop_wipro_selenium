package day7;

public class joinn {
	public static void main(String[] args) throws InterruptedException { 
		Thread t = new Thread(() -> System.out.println("Thread running")); t.start(); 
		t.join(); 
		System.out.println("Main thread continues"); 
		}
	}