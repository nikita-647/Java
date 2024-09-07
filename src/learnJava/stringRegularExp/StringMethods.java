 
 public class StringMethods {
  public static void main(String[] args) {
    String str1="Java"; 

    System.out.println(str1.length());
    System.out.println(str1.toUpperCase());
    System.out.println(str1.toLowerCase());

    String str2 = "  Welcome  ";
    System.out.println(str2.trim());

    String str3 = "Rahul Singh Kumar";

    String lastName = str3.substring(12);
    System.out.println(lastName);
    String middleName = str3.substring(6,11);
    System.out.println(middleName);

    System.out.println(str2.replace('e', 'k'));
    String str4 = "www.google.com";
    System.out.println(str4.startsWith("www."));
    System.out.println(str4.endsWith(".com")); 

    System.out.println(str4.charAt(4));
    System.out.println(str4.indexOf('g'));
    System.out.println(str4.indexOf('p'));
    System.out.println(str4.lastIndexOf('g'));

    String str5 = new String("Hello");
    String str6 = new String("hello");
    System.out.println(str5.equals(str6));
    System.out.println(str5.equalsIgnoreCase(str6));

    String str7 = "aman";
    String str8 = "Aman";
    System.out.println(str7.compareTo(str8));

  }
} 
