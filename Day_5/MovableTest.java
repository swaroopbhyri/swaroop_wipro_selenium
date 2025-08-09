package Day_5;


interface Movable {
 void moveUp();
 void moveDown();
 void moveLeft();
 void moveRight();
}

class MovablePoint implements Movable {
 int x, y, xSpeed, ySpeed;

 public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
 }

 @Override
 public void moveUp() {
     y -= ySpeed;
 }

 @Override
 public void moveDown() {
     y += ySpeed;
 }

 @Override
 public void moveLeft() {
     x -= xSpeed;
 }

 @Override
 public void moveRight() {
     x += xSpeed;
 }

 @Override
 public String toString() {
     return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
 }
}


class MovableCircle implements Movable {
 private int radius;
 private MovablePoint center;

 public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
     this.radius = radius;
     this.center = new MovablePoint(x, y, xSpeed, ySpeed);
 }

 @Override
 public void moveUp() {
     center.moveUp();
 }

 @Override
 public void moveDown() {
     center.moveDown();
 }

 @Override
 public void moveLeft() {
     center.moveLeft();
 }

 @Override
 public void moveRight() {
     center.moveRight();
 }

 @Override
 public String toString() {
     return "Circle radius=" + radius + ", center=" + center;
 }
}

class MovableRectangle implements Movable {
 private MovablePoint topLeft;
 private MovablePoint bottomRight;

 public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
     this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
     this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
     ensureSameSpeed();
 }

 private void ensureSameSpeed() {
     if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
         throw new IllegalArgumentException("Both points must have the same speed");
     }
 }

 @Override
 public void moveUp() {
     topLeft.moveUp();
     bottomRight.moveUp();
 }

 @Override
 public void moveDown() {
     topLeft.moveDown();
     bottomRight.moveDown();
 }

 @Override
 public void moveLeft() {
     topLeft.moveLeft();
     bottomRight.moveLeft();
 }

 @Override
 public void moveRight() {
     topLeft.moveRight();
     bottomRight.moveRight();
 }

 @Override
 public String toString() {
     return "Rectangle topLeft=" + topLeft + ", bottomRight=" + bottomRight;
 }
}


public class MovableTest {
 public static void main(String[] args) {
     MovablePoint p1 = new MovablePoint(0, 0, 2, 3);
     System.out.println("Initial Point: " + p1);
     p1.moveRight();
     p1.moveUp();
     System.out.println("After move: " + p1);

     MovableCircle c1 = new MovableCircle(5, 10, 10, 1, 1);
     System.out.println("\nInitial Circle: " + c1);
     c1.moveDown();
     c1.moveLeft();
     System.out.println("After move: " + c1);

     MovableRectangle r1 = new MovableRectangle(0, 0, 4, 4, 2, 2);
     System.out.println("\nInitial Rectangle: " + r1);
     r1.moveUp();
     r1.moveRight();
     System.out.println("After move: " + r1);
 }
}
