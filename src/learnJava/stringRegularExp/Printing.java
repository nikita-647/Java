package learnJava.stringRegularExp;
class Printing {
  public static void main(String[] args) {
    
    int a=10;
    float b=12.55f;
    char c='A';
    String str = "Hello";

    System.out.print(a);
    System.out.println(b);

    System.out.println(a);
    System.out.println(b);

    System.out.println(c);
    System.out.println(str);

    // concatenation
    System.out.println(a+str);

    int x=10,y=20;

    System.out.println(x + y + " sum");
    // 1020 sum
    System.out.println(x +""+ y + " sum");
    System.out.println("sum " + x + y);
    System.out.println("sum " + (x + y));

    // "Sum of 10 and 20 is 30"
    
    System.out.println("Sum of " + x + " and " + y + " is " + (x+y) );
  }
}