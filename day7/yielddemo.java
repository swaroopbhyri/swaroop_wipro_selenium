package day7;

public class yielddemo { 
	public static void main(String[] args) {
		new Thread(() -> { for(int i=0; i<5; i++) { System.out.println("Thread 1");
		Thread.yield(); } }).start();
		new Thread(() -> { for(int i=0; i<5; i++) { System.out.println("Thread 2"); } }).start(); 
		}
	}