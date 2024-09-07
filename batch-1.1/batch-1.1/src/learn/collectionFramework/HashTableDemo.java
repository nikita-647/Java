package learn.collectionFramework;

// import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        // String s = (String) ht.get(2);

        // Enumeration e= ht.elements();
        //
        // while(e.hasMoreElements()){
        // System.out.println(e.nextElement());
        // }
        // System.out.println(s);

        ht.compute(3, (k, v) -> v + "Z" + k);
        ht.computeIfAbsent(7, (k) -> "ZZ" + k);

        System.out.println(ht);

    }
}
