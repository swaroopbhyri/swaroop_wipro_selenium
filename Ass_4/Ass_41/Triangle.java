package Ass_41;
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle...");
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
