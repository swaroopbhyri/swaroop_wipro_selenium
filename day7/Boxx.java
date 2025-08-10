package day7;

class Boxxx { 
	int width; 
	int height;
	int depth; 
	public Boxxx(int width, int height, int depth) {
		this.width = width; 
		this.height = height;
		this.depth = depth;
		}
	public void displayDimensions() { 
		System.out.println("Width: " + width + ", Height: " + height + ", Depth: " + depth); 
		}
	}
public class Boxx { 
	public static void main(String[] args) {
		Boxxx myBox = new Boxxx(10, 20, 30); 
		System.out.println("Original dimensions:");
		myBox.displayDimensions(); 
		modifyBox(myBox); 
		System.out.println("\nDimensions after modification:");
		myBox.displayDimensions();
}
	public static void modifyBox(Boxxx myBox) { 
		System.out.println("\nInside modifyBox method - before changes:");
		myBox.displayDimensions();
		myBox.width *= 2; 
		myBox.height *= 2;
		myBox.depth *= 2;
		System.out.println("Inside modifyBox method - after changes:"); 
		myBox.displayDimensions(); 
		} 
	}
