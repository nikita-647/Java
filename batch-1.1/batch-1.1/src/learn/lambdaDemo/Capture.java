package learn.lambdaDemo;

interface MyLambdaNew {
  public void display();
}

class Demo {
  int temp = 0;

  public void method1() {
    int count = 0;

    MyLambdaNew m1 = () -> {
      int x = 0;
      System.out.println("Hi");
      System.out.println("Bye" + x + " " + count + " " + temp);

      x++;
    };
    temp++;

    m1.display();

  }
}

class UseLambda {
  public void callLambda(MyLambdaNew m1) {
    m1.display();
  }
}

public class Capture {
  public static void main(String[] args) {
    UseLambda u1 = new UseLambda();
    u1.callLambda(() -> {
      System.out.println("hello callback");
    });
  }
}
