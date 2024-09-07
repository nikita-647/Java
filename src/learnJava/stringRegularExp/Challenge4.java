package learnJava.stringRegularExp;
public class Challenge4 {
  public static void main(String[] args) {
    // Find is the date in Date Format (dd/mm/yyyy)

    String str= "31/12/2023";
    System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
  }
}
