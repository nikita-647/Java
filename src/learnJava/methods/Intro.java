package learnJava.methods;

public class Intro {

  static int max(int x, int y) {
    y++;
    if (x > y)
      return x;
    else
      return y;
  }

  public static void main(String[] args) {
    int a = 10, b = 15, c;

    c = max(a, b);
    System.out.println(c);
    System.out.println(b);

    System.out.println(max(200, 250));
  }
}
