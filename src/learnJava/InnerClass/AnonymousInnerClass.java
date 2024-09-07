package learnJava.InnerClass;

abstract class My{
    abstract void Display();
}

class Test {
    // Anonymous inner class
    public void meth(){
    My m = new My() {
        public void Display(){
            System.out.println("My Anonymous inner class");
        }
    };
    m.Display();
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Test t = new Test();
        t.meth();
    }
    
}
