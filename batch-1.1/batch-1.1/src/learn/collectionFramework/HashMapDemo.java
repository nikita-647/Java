package learn.collectionFramework;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        java.util.HashMap<Integer, String> hm = new java.util.HashMap<>(Map.of(0, "A", 1, "B", 2, "C"));
        hm.put(4, "E");
        hm.put(6, "G");

        String s = hm.get(2);
        System.out.println(s);
        System.out.println(hm);
    }
}
