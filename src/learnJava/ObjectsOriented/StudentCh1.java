package learnJava.ObjectsOriented;

class Rectangle{
    double length;
    double breadth;

    public double area() {
        return length*breadth;
    }
    public double perimeter() {
        return 2* (length+breadth);
    }
    public boolean isSquare() {
        return length == breadth;
    }
}
public class StudentCh1 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=10;
        r1.breadth=5;
        System.out.println("Area " + r1.area());
        System.out.println("Perimeter " + r1.perimeter());
        System.out.println("Is it a Square " + r1.isSquare());

        Rectangle r2=new Rectangle();
        r2.length=50;
        r2.breadth=50;
        System.out.println("Area2 " + r2.area());
        System.out.println("Perimeter2 " + r2.perimeter());
        System.out.println("Is it a Square2 " + r2.isSquare());
    }
}
