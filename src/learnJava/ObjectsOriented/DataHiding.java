package learnJava.ObjectsOriented;

// properties => values and variables
// behavior => methods
class RectangleNew {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {
        if (l > 0)
            length = l;
        else
            length = 0;
    }

    public void setBreadth(double b) {
        if (b > 0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area() {
        return getLength() * getBreadth();
    }

    public double perimeter() {
        return 2 * (getLength() + getBreadth());
    }

    public boolean isSquare() {
        return getLength() == getBreadth();
    }
}

public class DataHiding {
    public static void main(String[] args) {
        RectangleNew r1 = new RectangleNew();
        r1.setLength(10);
        r1.setBreadth(5);
        System.out.println(r1.area());
    }
}
