package learnJava.operators;

public class BitWise {
  public static void main(String[] args) {
    int x=0b1010, y=0b110;

    int a = x&y;
    int b = x|y;
    int c = x^y;

    int d = x<<1;
    int e = x>>1;
    int f = ~y;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
  }
}
