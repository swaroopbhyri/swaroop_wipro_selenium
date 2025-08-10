package day7;

public class thread2 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName()); 
		}
	public static void main(String[] args) {
		new Thread(new thread2()).start();
		}
	}
