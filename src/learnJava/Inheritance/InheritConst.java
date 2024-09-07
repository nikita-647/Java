package learnJava.Inheritance;

class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }

    public Parent(int x) {
        System.out.println("Params of Parent class " + x);
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }

    public Child(int y) {
        System.out.println("Params of Child class " + y);
    }

    public Child(int x, int y) {
        super(x);
        System.out.println("2 Params of Child class " + y);
    }
}

// class GrandChild extends Child {
// public GrandChild() {
// System.out.println("GrandChild Constructor");
// }
// }

public class InheritConst {
    public static void main(String[] args) {
        Child c = new Child(20, 10);
    }
}
