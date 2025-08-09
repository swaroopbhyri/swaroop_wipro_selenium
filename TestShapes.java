package Ass_41;

public class TestShapes {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 8)
        };

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.area());
            System.out.println("----------------------");
        }
    }
}