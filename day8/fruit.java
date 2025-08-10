package day8;

import java.util.ArrayList; 
import java.util.Scanner; 
public class fruit { 
	public static void main(String[] args) { 
		ArrayList<String> fruits = new ArrayList<>(); 
		fruits.add("Apple");
		fruits.add("Banana"); 
		fruits.add("Orange"); 
		fruits.add("Mango"); 
		fruits.add("Grapes"); 
		System.out.println("Original Fruit List: " + fruits);
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter fruit name to remove: "); 
		String fruitToRemove = scanner.nextLine(); 
		if (fruits.remove(fruitToRemove)) { 
			System.out.println(fruitToRemove + " removed successfully!"); 
			}
		else {
			System.out.println(fruitToRemove + " not found in the list."); 
			}
		System.out.println("Updated Fruit List: " + fruits); 
		scanner.close();
		}
	}
