package day8;

import java.util.ArrayList;
import java.util.Collections;
public class sort {
	public static void main(String[] args) { 
		ArrayList<Integer> numbers = new ArrayList<>(); 
		numbers.add(34);
		numbers.add(12);
		numbers.add(89); 
		numbers.add(5); 
		numbers.add(42); 
		numbers.add(17); 
		numbers.add(63); 
		System.out.println("Original List: " + numbers); 
		Collections.sort(numbers); 
		System.out.println("Sorted List" + numbers); 
		}
	}