package day8;

import java.util.LinkedList; 
public class clone{ 
	public static void main(String[] args) {
		LinkedList<Integer> ogList = new LinkedList<>(); 
		ogList.add(10);
		ogList.add(20); 
		ogList.add(30);
		ogList.add(40); 
		System.out.println("Original LinkedList: " + ogList);
		LinkedList<Integer> clonedList = (LinkedList<Integer>) ogList.clone();
		System.out.println("Cloned LinkedList: " + clonedList);
		ogList.add(50);
		clonedList.removeLast();
		System.out.println("\nAfter modifications:"); 
		System.out.println("Original LinkedList: " + ogList);
		System.out.println("Cloned LinkedList: " + clonedList);
		}
	}
