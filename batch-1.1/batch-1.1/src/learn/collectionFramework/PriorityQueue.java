package learn.collectionFramework;

import java.util.Comparator;

// larger number higher
// smaller number lower

class MyCom implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;
        if (o1 > o2)
            return -1;
        return 0;
    }

}

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue<>(new MyCom());

        queue.add(20);
        queue.add(10);
        queue.add(30);
        queue.add(5);
        queue.add(15);
        queue.add(3);

        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
    }
}
