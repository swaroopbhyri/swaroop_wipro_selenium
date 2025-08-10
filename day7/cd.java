package day7;

import java.util.concurrent.*; 
public class cd { 
	public static void main(String[] args) throws Exception { 
		ExecutorService executor = Executors.newSingleThreadExecutor(); 
		Future<Integer> future = executor.submit(() -> { Thread.sleep(1000); return 5 * 7; });
		System.out.println("Result: " + future.get()); executor.shutdown();
} 
	}