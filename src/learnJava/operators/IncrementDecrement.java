package learnJava.operators;
public class IncrementDecrement {
  public static void main(String[] args) {
    // int x=5, y;
    
    // y=x++;
    // System.out.println(y + " " + x);

    // y=++x;
    // System.out.println(y + " " + x);

    int x=5, y=4, z;

    z = 2 * x++ + 3 * ++x;

    System.out.println(z);

    char c='A';
    int a=c;
    System.out.println(a);
    System.out.println(++c);
  }
}
