package learnJava.Inheritance;

class A {
    public void display() {
        System.out.println("Hello");
    }
}

class B extends A {

    // @Override
    public void display() {
        System.out.println("Hello World");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.display();

        B obj2 = new B();
        obj2.display();

        A obj3 = new B();
        obj3.display();

    }

}
