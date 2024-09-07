package learnJava.StaticPractice;

class CoffeeMachine{
    private float coffeeQty;
    private float waterQty;
    static private CoffeeMachine our = null;

    private CoffeeMachine(){
        coffeeQty = 1;
        waterQty = 1;
    }

    static public CoffeeMachine getCoffee() {
        if(our == null){

our = new CoffeeMachine();

        }
        return our;
    }
}

public class Person1 {
    public static void main(String[] args) {
        int x = 10;
        String s = "Hello";
        // CoffeeMachine cip1 = new CoffeeMachine();

        CoffeeMachine cup1 = CoffeeMachine.getCoffee();
        CoffeeMachine cup2 = CoffeeMachine.getCoffee();
        CoffeeMachine cup3 = CoffeeMachine.getCoffee();
        CoffeeMachine cup4 = CoffeeMachine.getCoffee();
        if (cup1 == cup2 && cup3 == cup4){
            System.out.println("Same");
        }

    }
}
