package learnJava.operators;
import java.util.Scanner;
public class CuboidArea {
  public static void main(String[] args) {
    int length, breath, height;
    int totalArea, volume;

    System.out.println("Enter length, breath and height: ");
    Scanner sc = new Scanner(System.in);
    length = sc.nextInt();
    breath = sc.nextInt();
    height = sc.nextInt();

    totalArea = 2 * (length*height + breath*height + length*breath);
    volume = length*breath*height;

    // System.out.println("Total surface area: " + totalArea);
    // System.out.println("Volume: " + volume);

    System.out.println("Total surface area and volume: " + totalArea + ", " +volume);
  }
}
