package day7;

public class even {
	public static void main(String[] args) {
		new Thread(() -> { for(int i=1; i<=10; i+=2) 
			System.out.println("Odd: "+i); }).start();
		new Thread(() -> { for(int i=2; i<=10; i+=2)
			System.out.println("Even: "+i); }).start(); 
		}
	}