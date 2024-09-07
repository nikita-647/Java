package learn.collectionFramework;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        tm.put(4, "E");
        tm.put(6, "G");

        System.out.println(tm.ceilingEntry(5));
        System.out.println(tm.ceilingEntry(5).getValue());

        String s = tm.get(2);
        System.out.println(s);

        System.out.println(tm);

        tm.replace(6, "F");
        System.out.println(tm);
    }
}
