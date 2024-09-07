package learnJava.ObjectsOriented;

// creating a circle class
// 1. properties
// radius
// 2. methods
// area()
// perimeter()
// circumference()

class Circle {
    double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public double circumference() {
        return perimeter();
    }
}

public class Introduction {
    public static void main(String[] args) {
        Circle circleSmall = new Circle();
        circleSmall.radius = 5;
        System.out.println(circleSmall.area());
        // System.out.println(circleSmall.perimeter());
        // System.out.println(circleSmall.circumference());

        Circle circleLarge = new Circle();
        circleLarge.radius = 15;
        System.out.println(circleLarge.area());
    }
}
