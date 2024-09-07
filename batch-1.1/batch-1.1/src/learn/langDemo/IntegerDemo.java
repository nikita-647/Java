package learn.langDemo;

public class IntegerDemo {
  public static void main(String[] args) {
    int m1 = 15;
    Integer m2 = m1;
    Integer m3 = 25;

    Integer m4 = Integer.valueOf("124");
    Integer m5 = Integer.valueOf("1111111", 2);
    Integer m6 = Integer.valueOf("A7", 16);

    // System.out.println(m2.compareTo(10));
    System.out.println(m2.equals(m3));
    System.out.println(m4);
    System.out.println(m5);
    System.out.println(m6);

    System.out.println(Integer.toBinaryString(40));

  }
}
