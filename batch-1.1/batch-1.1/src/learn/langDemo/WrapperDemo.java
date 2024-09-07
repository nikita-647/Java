package learn.langDemo;

public class WrapperDemo {
  @SuppressWarnings({ "removal", "unused" })
  public static void main(String[] args) {

    int aa = 12;
    short ss = 13;

    Integer i = new Integer(10);
    Integer a = Integer.valueOf(20);
    Integer b = 30;

    Byte c = 15;
    Byte d = Byte.valueOf("15");
    byte bb = 15;
    Byte e = Byte.valueOf(bb);

    Short f = Short.valueOf("123");

    Float g = 12.4f;
    Float h = Float.valueOf("123.5");

    Double j = Double.valueOf(123.456);

    Character k = Character.valueOf('A');

    Boolean l = Boolean.valueOf("true");

    System.out.println(i + " " + a + " " + b);
    System.out.println(c + " " + d + " " + e);

    int m = 10;
    // auto boxing
    Integer n = m;

    // auto unboxing
    int o = n;

  }
}
