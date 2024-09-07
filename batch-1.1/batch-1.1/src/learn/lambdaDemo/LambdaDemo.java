package learn.lambdaDemo;

@FunctionalInterface
interface MyLambda {
  public void display(String str, int x, int y);
}

@FunctionalInterface
interface MyLambdaTwo {
  public int sum(int x, int y);
}

public class LambdaDemo {
  public static void main(String[] args) {
    MyLambda m = (s, a, b) -> System.out.println("Hello World " + s + " " + (a + b));

    MyLambdaTwo m2 = (a, b) -> a + b;

    m.display("Rahul", 10, 20);
    m2.sum(20, 20);
  }
}
