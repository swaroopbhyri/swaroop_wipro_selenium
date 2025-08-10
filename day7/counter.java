package day7;

class Counter { 
	static int count = 0;
	public static void main(String[] args) {
		Runnable r = () -> { for(int i=0; i<1000; i++) count++; };
		new Thread(r).start(); 
		new Thread(r).start(); 
		try { Thread.sleep(1000); } 
		catch (InterruptedException e)
		{} 
		System.out.println(count);
		}
	}