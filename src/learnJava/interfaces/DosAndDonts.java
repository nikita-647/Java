package learnJava.interfaces;

import java.lang.Math;


interface Test {
    int y = 20;
    final static int x = 10;

    void meth1();

    abstract public void meth2();

    // public static void meth3() {
        // System.out.println("Meth3 of Test interface");
    // }

    public static void meth4(){
        System.out.println("meth4 of test interface");
    }

    public default void meth6() {
        System.out.println("meth6 of test interface");
    }
}
 interface  Test2 extends Test  {
void meth5();
    
}

class Demo implements Test1{
    static String name = "Rahul";

    public void meth1(){

    }

    public void meth2(){

    }
    public void meth4(){
     System.out.println("Hello");
    }

}
public class DosAndDonts {
    
    public static void main(String[] args) {
    }
}
