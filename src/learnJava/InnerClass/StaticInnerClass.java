package learnJava.InnerClass;

// Static inner class
class Parent{
     static int x = 10;
    int y= 20;

    static class Child{
        void Display() {
            System.out.println(x);
            // system.out.println(y); not allowed
        }
    }

}

public class StaticInnerClass {
    public static void main(String[] args) {
        Parent.Child c = new Parent.Child();
        c.Display();
    }
}
