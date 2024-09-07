package learnJava.loops;

import java.util.Scanner;

public class LoopCh1 {
  public static void main(String[] args) {
    //* 1 Display Multiplication table of n number

    // output: 
    // 5 * 1 = 5    
    // 5 * 2 = 10

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number: ");
		int n = sc.nextInt();

    // for(int i = 1; i <= 10; i++) {
    //   System.out.println(n + " * " + i + " = " + n*i);
    // }

    //* 2 Find sum of n number
    // input 5
    // output 15

    // int sum = 0;
    // for (int i = 1; i <= n; i++){
    //   sum = sum + i;
    // }
  
    // System.out.println(sum);

    //* Factorial of n number

    // input 5!
    // output 120

      int r;

      while (n>0){
        r=n%10;
        n=n/10;

        System.out.println(r);
      }

  }
}
