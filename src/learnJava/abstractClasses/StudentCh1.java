package learnJava.abstractClasses;

abstract class Shape {
  abstract public double perimeter();

  abstract public double area();
}

class Circle extends Shape {
  double radius;

  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
  double length;
  double breath;

  public double perimeter() {
    return 2 * (length + breath);
  }

  public double area() {
    return length * breath;
  }
}

public class StudentCh1 {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.radius = 10;
    System.out.println(c.area());

    Rectangle r = new Rectangle();

    Shape s = new Rectangle();
  }
}
