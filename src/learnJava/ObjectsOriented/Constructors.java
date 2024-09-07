package learnJava.ObjectsOriented;

class Demo {
    private int prop1;
    private int prop2;

    public Demo() {
        prop1 = 1;
        prop2 = 1;
    }

    public Demo(int p1) {
        prop1 = prop2 = p1;
    }

    public Demo(int p1, int p2) {
        prop1 = p1;
        prop2 = p2;
    }

    public int getProp1() {
        return prop1;
    }

    public int getProp2() {
        return prop2;
    }

    public void setProp1(int p1) {
        prop1 = p1;
    }

    public void setProp2(int p2) {
        prop2 = p2;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Demo d1 = new Demo(10, 20);
        System.out.println(d1.getProp1());
        System.out.println(d1.getProp2());

        Demo d2 = new Demo(50);
        System.out.println(d2.getProp1());
        System.out.println(d2.getProp2());
    }
}
