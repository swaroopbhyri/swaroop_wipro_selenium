package day7;

public class stopt extends Thread {
	private boolean stop = false; 
	public void run() { 
		while(!stop) { 
			System.out.println("Running...");
			} 
		}
	public void stopThread() {
		stop = true; 
		} 
	public static void main(String[] args) throws InterruptedException { 
		stopt t = new stopt(); 
		t.start(); 
		Thread.sleep(100);
		t.stopThread(); 
		} 
	}