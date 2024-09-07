package learn.collectionFramework;

import java.util.*;

public class ListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> al1 = new ArrayList<>(20);

    ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90, 70));

    al1.add(10);
    al1.add(0, 5);
    al1.addAll(al2);

    System.out.println(al1.contains(40));
    System.out.println(al1.get(2));
    System.out.println(al1.indexOf(70));
    System.out.println(al1.lastIndexOf(70));
    al1.set(6, 100);

    // System.out.println("-------------------------Iterator-------------------------");
    // for (Iterator<Integer> it = al1.iterator(); it.hasNext();) {
    // Integer x = it.next();
    // System.out.print(x + " ");
    // }

    // Iterator<Integer> it = al1.iterator();
    // while (it.hasNext()) {
    // System.out.print(it.next() + " ");
    // }
    // System.out.println();

    // System.out.println(al1);

    al1.forEach(n -> show(n));
  }

  static void show(int n) {
    if (n >= 60) {
      System.out.print(n + " ");
    }
  }
}
