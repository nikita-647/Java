package learnJava.ObjectsOriented;

class MyClass {
    String name;

    public MyClass(String n) {
        name = n;
    }

    public String toString() {
        return "name: " + name;
    }
}

public class ArryaOfObjects {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3 };
        MyClass[] objects = { new MyClass("Mohit"), new MyClass("Raj"), new MyClass("Vijay") };

        System.out.println(objects[0]);
        System.out.println(objects[1]);
        System.out.println(objects[2]);

        // int[] b = new int[3];
        // b[0] = 10;
        // b[1] = 20;
        // b[2] = 30;

        MyClass[] objectsNew = new MyClass[3];
        objectsNew[0] = new MyClass("Naman");
        objectsNew[1] = new MyClass("Rahul");
        objectsNew[2] = new MyClass("Vansh");

        for (MyClass x : objectsNew) {
            System.out.println(x);
        }

        // MyClass obj = new MyClass("Rahul");
        // System.out.println(obj);

    }
}
