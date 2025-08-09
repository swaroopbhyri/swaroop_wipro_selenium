package Day_5;

public class BackwardSequence implements CharSequence {
    private final String reversed;

    public BackwardSequence(String original) {
        if (original == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        this.reversed = new StringBuilder(original).reverse().toString();
    }

    @Override
    public int length() {
        return reversed.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= reversed.length()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return reversed.charAt(index);
    }


    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > reversed.length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid start or end");
        }
        return reversed.substring(start, end);
    }


    @Override
    public String toString() {
        return reversed;
    }

    public static void main(String[] args) {
        BackwardSequence seq = new BackwardSequence("hello");

        System.out.println("Reversed String: " + seq); 
        System.out.println("Length: " + seq.length()); 
        System.out.println("Char at index 1: " + seq.charAt(1)); 
        System.out.println("Subsequence (1, 4): " + seq.subSequence(1, 4)); 
    }
}
