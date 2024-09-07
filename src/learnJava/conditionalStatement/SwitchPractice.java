package learnJava.conditionalStatement;
public class SwitchPractice {
  public static void main(String[] args) {
    
    int day = 5;
    // String day = "monday"
    
    //* Switch case statement

    switch(day) {
      case 1: System.out.println("Monday");
        break;
      case 2: System.out.println("Tuesday");
        break;
      case 3: System.out.println("Wednesday");
        break;
      case 4: System.out.println("Thursday");
        break;
      case 5: System.out.println("Friday");
        break;
      case 6: System.out.println("Saturday");
        break;
      case 7: System.out.println("Sunday");
        break;
      default: System.out.println("Not valid day");
    }
    
    // if(day==1) {
    //   System.out.println("Monday");
    // } else if(day==2) {
    //   System.out.println("Tuesday");
    // } else if(day==3) {
    //   System.out.println("Wednesday");
    // } else if(day==7) {
    //   System.out.println("Sunday");
    // } else {
    //   System.out.println("Not valid day");
    // }
  }
}
