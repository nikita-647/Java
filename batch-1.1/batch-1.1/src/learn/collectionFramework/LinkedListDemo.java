package learn.collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(al2);
        al1.add(5, 70);

        al1.set(6, 100);

        System.out.println(al1);

        al1.forEach(n -> show(n));

    }

    static void show(int n) {
        if (n >= 60) {
            System.out.println(n + " ");
        }
    }
}