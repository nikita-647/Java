package learnJava.loops;

public class LoopPractice {
  public static void main(String[] args) {
    // while loop
    int i = 1;

    while(i < 10){
      System.out.println("Hello while Loop " + i);
      i++;
    }

    // i = 1; true; code=>i++
    // i = 2; true; code=>i++
    // i = 99; true; code=>i++
    // i = 100; false


    // do_while loop
    int x = 1;
    do {
      System.out.println("Hello do_while Loop " + x);
      x++;
    } while (x < 10);

    // x = 1; code=>x++; 
    // x = 2; true; code=>x++
    // x = 99; true; code=>x++
    // x = 100; false

    // for loop
    // nested for loop
  }
}
