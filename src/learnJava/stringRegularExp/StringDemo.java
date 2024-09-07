package learnJava.stringRegularExp;
public class StringDemo {
  public static void main(String[] args) {

    String str1="Java Program";
    System.out.println(str1);

    String str2=new String("JAVA");
    System.out.println(str2);

    char c[] = {'H', 'e', 'e', 'l', 'o'};
    String str3=new String(c);
    System.out.println(str3);

    char b[] = {65, 66, 67, 68};
    String str4=new String(b);
    System.out.println(str4);

    String str5="Java";
    String str6="Java";

    System.out.println(str5 == str6);

    String str7=new String("JAVA");
    String str8=new String("JAVA");
    System.out.println(str7 == str8);
  }
}
