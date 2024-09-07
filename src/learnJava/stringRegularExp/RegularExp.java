package learnJava.stringRegularExp;
public class RegularExp {
  public static void main(String[] args) {

    //* PART THREE */
    String str1 = "123456";
    System.out.println(str1.matches("\\d*"));

    String str2 = "abcAbC?.><";
    System.out.println(str2.matches("\\D*"));

    String str3 = "           ";
    System.out.println(str3.matches("\\s*"));

    String str4 = "dsfsd232sdsd$";
    System.out.println(str4.matches("\\S*"));

    System.out.println(str4.matches("\\w*"));

    String str5 = "@$@$^?><][]";
    System.out.println(str5.matches("\\W*"));

    //* PART TWO */
    
    // System.out.println(str1.matches(".*"));
    // System.out.println(str1.matches(".+"));
    // System.out.println(str1.matches("[a-zA-Z]+"));

    // String str2 = "bca";
    // System.out.println(str2.matches("[abc]{3}"));

    // String str3 = "12345";
    // System.out.println(str3.matches("[0-9]{3,7}"));

    // String str4 = "ab";
    // System.out.println(str4.matches(".?"));

    //* PART ONE */
    
    // String str1 = "f";
    // System.out.println(str1.matches("."));

    // String str2 = "c";
    // System.out.println(str2.matches("[abc]"));

    // String str3 = "P";
    // System.out.println(str3.matches("[^abcdef]"));
    // System.out.println(str3.matches("[a-z0-9]"));

    // String str4="b8";
    // System.out.println(str4.matches("[a-z][0-9]"));

    // String str5="c";
    // System.out.println(str5.matches("a|b"));

    // String str6="FED";
    // System.out.println(str6.matches("DEF"));
  }
}