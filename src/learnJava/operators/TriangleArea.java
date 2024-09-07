package learnJava.operators;
import java.util.Scanner;

public class TriangleArea {
  public static void main(String[] args) {
    System.out.println("Triangle Area");

    int a, b, c;
    float s;
    double area;
    System.out.println("Enter 3 sides of a triangle: ");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();

    s=(a+b+c)/2f;
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("Area of triangle is " + area);

    // float base, height, area;

    // System.out.println("Enter Base and Height: ");
    // // making object of Scanner
    // Scanner sc=new Scanner(System.in);
    // base = sc.nextFloat();
    // height = sc.nextFloat();

    // // area = base * height * 0.5f;
    // // area = 1f/2f * base * height;
    // area = base * height / 2;

    // System.out.println("Area of triangle is " + area);
  }
}
