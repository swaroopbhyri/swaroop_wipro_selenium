package day7;
public class t1 extends Thread { 
	public void run() {
		for(int i=1; i<=5; i++) { 
			System.out.println(i);
			} 
		}
	public static void main(String[] args) { 
		new t1().start();
		}
	}