package day7;

public class box { 
	public static void main(String[] args) { 
		Box myBox = new Box(10); 
		System.out.println("Original length: " + myBox.length); 
		modifyBoxLength(myBox, 25);
		System.out.println("Length after modification: " + myBox.length);
		}
	public static void modifyBoxLength(Box box, int newLength) {
		box.length = newLength;
		System.out.println("Inside method - modified length: " + box.length); 
		}
	}
class Box {
	int length; 
	public Box(int length) {
		this.length = length; 
		}
	}
