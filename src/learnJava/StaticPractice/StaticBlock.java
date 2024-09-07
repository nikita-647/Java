package learnJava.StaticPractice;


class Demo{
    static String tasks[] = new String[10];
    static{
        tasks[0] = "learn html";
        tasks[1] = "learn javascript";
        tasks[2] = "learn AWS";
        System.out.println("Staring");
    }
    static{
        System.out.println("Ending");
    }
}


public class StaticBlock {
    // static{
        // System.out.println("Hello");
    // }

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.tasks[2]);
        System.out.println("Main");
    }

    // static{
        // System.out.println("Bye");
        // }
    }
    

