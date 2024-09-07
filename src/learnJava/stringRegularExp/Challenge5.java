package learnJava.stringRegularExp;
public class Challenge5 {
  public static void main(String[] args) {

    // Question 5.
    // Remove Special Characters from a String
    String str="abc%&def//.;hij123456";
    System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    System.out.println(str.replaceAll("[\\W]",""));


    // Question 6.
    // Remove extra spaces from a String
    String str2=" abc    def   ;hij  123456   ";
    System.out.println(str2);
    System.out.println(str2.replaceAll("\\s+"," ").trim());
  }
}

