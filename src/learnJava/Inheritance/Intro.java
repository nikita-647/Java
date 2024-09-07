package learnJava.Inheritance;

class Circle {
    public double radius;

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class Intro {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 5;
        c1.height = 10;
        System.out.println(c1.volume());
    }

}
