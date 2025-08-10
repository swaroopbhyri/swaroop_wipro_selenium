package day7;

public class Priorityyy { 
	public static void main(String[] args) { 
		Thread t1 = new Thread(() -> System.out.println("High priority"));
		Thread t2 = new Thread(() -> System.out.println("Low priority"));
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start(); 
		t2.start();
		} 
	}