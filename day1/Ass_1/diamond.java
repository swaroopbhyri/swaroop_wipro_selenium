package Ass_1;

public class diamond {
 public static void main(String[] args) {
	 int rows = 5; 

     for (int i = 1; i <= rows; i++) {
        
         for (int j = i; j < rows; j++) {
             System.out.print(" ");
         }

      
         for (int k = 1; k <= (2 * i - 1); k++) {
             System.out.print("*");
         }

         System.out.println();
     }

     // Bottom 
     for (int i = rows - 1; i >= 1; i--) {
         // Print spaces
         for (int j = rows; j > i; j--) {
             System.out.print(" ");
         }

     
         for (int k = 1; k <= (2 * i - 1); k++) {
             System.out.print("*");
         }

         System.out.println();
     }
}
}
