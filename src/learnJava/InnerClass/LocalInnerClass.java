package learnJava.InnerClass;

class OuterNew{

    void Display(){
        // local inner class
        class InnerNew{
            void InnerDisplay(){
                System.out.println("Hello");
            }
        }

        // InnerNew i = new InnerNew();
        // i.InnerDisplay();

        new InnerNew().InnerDisplay(); //Anonymous objest
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterNew o = new OuterNew();
        o.Display();
    }
}
