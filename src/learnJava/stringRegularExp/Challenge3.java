package learnJava.stringRegularExp;
public class Challenge3 {
  public static void main(String[] args) {
    // Find is a Number is Hexa-Decimal or not

    String str= "123Af";
    System.out.println(str.matches("[0-9a-fA-F]+"));
  }
}
