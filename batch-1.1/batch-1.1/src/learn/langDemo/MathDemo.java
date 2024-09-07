package learn.langDemo;

public class MathDemo {
  public static void main(String[] args) {
    System.out.println("Absolute: ");
    System.out.println(Math.abs(-123));

    System.out.println("Absolute: ");
    System.out.println(StrictMath.abs(-123));

    System.out.println("Cube Root: ");
    System.out.println(Math.cbrt(8));

    System.out.println("Cube Root: ");
    System.out.println(StrictMath.cbrt(-8));

    System.out.println("Decrement Exact: ");
    System.out.println(Math.decrementExact(7));

    System.out.println("Floor");
    System.out.println(Math.floor(12.45));
    System.out.println(Math.floor(12.85));

    System.out.println(Math.floor(-12.45));
    System.out.println(Math.floor(-12.85));

    System.out.println("Ceil");
    System.out.println(Math.ceil(12.45));
    System.out.println(Math.ceil(12.85));

    System.out.println(Math.ceil(-12.45));
    System.out.println(Math.ceil(-12.85));

    System.out.println(Math.floorDiv(50, 9));
    System.out.println(Math.floorDiv(71, 7));
    System.out.println(Math.floorDiv(60, 6));

    System.out.println(Math.random());
    System.out.println(Math.sqrt(25));
    System.out.println(Math.pow(2, 3));
    System.out.println(Math.multiplyExact(100, 20));
  }
}
