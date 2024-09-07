package learnJava.methods;

public class PassingString {

  static String machine(String str) {
    str = "Sona";
    System.out.println(str);
    return str;
  }

  public static void main(String[] args) {
    System.out.println(machine("Aalo"));
  }

  // 1. Find a Number is Prime or not
  // 2. Find HCF of 2 numbers
  // 3. Find max el in an array
}
