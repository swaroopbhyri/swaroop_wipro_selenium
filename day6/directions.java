package day6;

import java.util.Scanner;

public class directions { 
	enum Direction{NORTH,SOUTH,EAST,WEST}
	public static void main(String[] args) throws IllegalArgumentException { 
		 Scanner sc = new Scanner(System.in); 
		 System.out.print("Enter a direction :"); 
		 String input = sc.nextLine(); 
		 Direction direction = Direction.valueOf(input); 
		 switch(direction) { 
		 case NORTH: 
			 System.out.println("Move north "); 
		 break; 
		 case SOUTH:
			 System.out.println("Move south"); 
			 break; 
			 case EAST:
				 System.out.println("Move east");
				 break; 
		case WEST:
			System.out.println("Move west");
			break; 
		 }
	}
}