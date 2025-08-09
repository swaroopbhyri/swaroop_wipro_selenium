package Day_5;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width! Setting default value 1.0");
            this.width = 1.0;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Invalid height! Setting default value 1.0");
            this.height = 1.0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayDetails() {
        System.out.println("Width     : " + width);
        System.out.println("Height    : " + height);
        System.out.println("Area      : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(-4, 7);
        Rectangle r3 = new Rectangle(4, -6);

        r1.displayDetails();
        r2.displayDetails();
        r3.displayDetails();
    }
}
