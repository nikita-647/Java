package learnJava.StaticPractice;

class Test {
    static int x = 10;
    int y = 20;

    void show() {
        System.out.println(x + " " + y);
    }

    static void display() {
        System.out.println(x);
    }
}

public class Intro {
    public static void main(String[] args) {       
        Test t1 = new Test();
        Test t2 = new Test();

        System.out.println(t2.x);
        t1.x = 100;
        System.out.println(t2.x);
        
        // System.out.println(Test.x); 

        // Test.display();
    }
    
}
