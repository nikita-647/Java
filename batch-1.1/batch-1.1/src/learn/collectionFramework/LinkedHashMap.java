package learn.collectionFramework;

import java.util.*;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<Integer, String> Lhm = new java.util.LinkedHashMap<>(5, 75f, true) {
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 5;
            }
        };

        Lhm.put(1, "Ä");
        Lhm.put(2, "B");
        Lhm.put(3, "C");
        Lhm.put(4, "D");
        Lhm.put(5, "E");

        String s = Lhm.get(2);
        Lhm.get(5);
        Lhm.get(1);
        Lhm.put(6, "F");
        // Lhm.get(s);

        // System.out.println(Lhm);
        Lhm.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
