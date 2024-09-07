package learnJava.Inheritance;

class Rectangle {
    int length;
    int breath;
    int x = 10;

    public Rectangle() {
        length = breath = 1;
    }

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 20;

    public Cuboid() {
        height = 1;
    }

    public Cuboid(int h) {
        height = h;
    }

    public Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    public int volume() {
        return length * breath * height;
    }

    public void display() {
        System.out.println(super.x);
        System.out.println(this.x);
    }
}

public class SuperConst {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(12, 5, 10);
        c.display();
    }
}
