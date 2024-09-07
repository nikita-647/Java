package learnJava.conditionalStatement;
public class logicalOperators {

  public static void main(String[] args) {
    int a=5, b=10, c=15;

    System.out.println(a < b);
    System.out.println(b > c);
    System.out.println(a == b);
    System.out.println(a == 5);
    System.out.println(a != b);

    // System.out.println(a > b && a > c);

    System.out.println("&& opr (AND)");
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);

    System.out.println("|| opr (OR)");
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);

    System.out.println(!true);
    System.out.println(!false);

  }
}