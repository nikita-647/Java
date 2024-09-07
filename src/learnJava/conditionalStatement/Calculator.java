package learnJava.conditionalStatement;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    // Menu driven calculator application
    System.out.println("~~MENU~~");
    System.out.println("========");
    System.out.println("ADD");
    System.out.println("SUB");
    System.out.println("MUL");
    System.out.println("DIV");

    System.out.println("Enter two numbers:");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();

    sc.nextLine();
    System.out.println("Enter option in words:");
    String op=sc.nextLine();


    switch (op) {
      case "add": System.out.println(x+y);
        break;
      case "sub": System.out.println(x-y);
        break;
      case "mul": System.out.println(x*y);
        break;
      case "div": System.out.println(x/y);
        break;
      default: System.out.println("invalid option");
        break;
    }

    // if(op.equals("add")) 
    // {
    //   System.out.println(x+y);
    // } 
    // else if(op.equals("sub")) 
    // {
    //   System.out.println(x-y);
    // } 
    // else if(op.equals("mul")) 
    // {
    //   System.out.println(x*y);
    // } 
    // else if(op.equals("div")) 
    // {
    //   System.out.println(x/y);
    // } 
    // else 
    // {
    //   System.out.println("invalid option");
    // }
  }
}
