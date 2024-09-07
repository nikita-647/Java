package learnJava.stringRegularExp;
public class Challenge2 {
  public static void main(String[] args) {
    // Find if a Number is Binary or not
    // "0010110001"

    // int b = 1000110;
    // System.out.println(b);
    // String str=String.valueOf(b);
    String str="0001001";


    System.out.println(str.matches("[01]+"));
  }
}
