package learnJava.stringRegularExp;
public class PrintFormatted {
  public static void main(String[] args) {

    // System.out.println("Hello " + x + " " + y + " " + z );
    // System.out.printf("Hello %d %f %c \n", x, y, z);
    // System.out.printf("Hello %o \n", x);
    // 0, 1, 2, 3, 4, 5, 6, 7, 10, 11, 12
    // System.out.printf("Hello %x \n", x);
    // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a

    // System.out.printf("Hello %f \n", y);
    // System.out.printf("Hello %e \n", y);

    // System.out.printf("%s \n", str);

    int x=10;
    float y=3.45f;
    char z='A';
    String str="Java Program";

    System.out.printf("%c", z);
    System.out.printf("%3$s %1$d %2$f %1$d", x, y, str );

    System.out.printf("%5d \n", x);
    System.out.printf("%05d \n", x);
    System.out.printf("%(5d \n", x);
    System.out.printf("%+5d \n", x);
    System.out.printf("%-5d Hello \n", x);
    System.out.printf("%06.2f \n", y);
  }
}
