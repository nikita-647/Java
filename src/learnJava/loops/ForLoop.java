package learnJava.loops;

public class ForLoop {
  public static void main(String[] args) {
    
    // for(int i = 1; i <= 10; i++){
    //   System.out.println(i);
    // }

    // int i = 1; true; code; i=2
    // true; code; i=3
    // true; code; i=4
    // ....
    // true; code; i=10
    // true; code; i=11
    // false; exit

    // int i = 1;
    // for(; i <= 10;){
    //   System.out.println(i);
    //   i++;
    // }


    // for(int i = 1, j = 2; i <= 10; i++, j=j*2){
    //   System.out.println(i + " j=" + j);
    // }

    for(int i = 10; i >= 1; i--){
      System.out.println(i);
    }
  }
}
