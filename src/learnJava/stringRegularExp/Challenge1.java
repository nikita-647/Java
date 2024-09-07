package learnJava.stringRegularExp;

public class Challenge1 {
  public static void main(String[] args) {
    String str1 = "programmer@yahoo.com";

    int i = str1.indexOf('@');
    String username = str1.substring(0, i);
    String domain = str1.substring(i+1);

    System.out.println("Username: " + username);
    System.out.printf("Domain: %s \n",domain);

    int j = domain.indexOf(".");
    String name=domain.substring(0,j);
    System.out.println("Is domain is of gmail? " + name.equals("gmail"));
  }
}
