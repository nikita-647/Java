package learn.test;

import java.util.ArrayList;
import java.util.List;

// Question 1. Implement a custom class with methods for insertion, deletion, and searching.

public class CustomClass {
    private List<Integer> dataList;

    public CustomClass() {
        this.dataList = new ArrayList<>();
    }

    public void insert(int e) {
        dataList.add(e);
    }

    public void delete(int e) {
        dataList.remove((Integer) e);
    }

    public boolean search(int e) {
        return dataList.contains(e);
    }

    public void display() {
        System.out.println("Elements in the list:");
        for (int e : dataList) {
            System.out.println(e + " ");
        }
        System.out.println();
    }
}

public class StudentCh7 {
    public static void main(String[] args) {
        CustomClass c = new CustomClass();

        c.insert(5);
        c.insert(10);
        c.insert(15);
        c.insert(20);

        c.display();

        c.delete(10);

        c.display();

        System.out.println("15 is found or not " + c.search(15));
        System.out.println("10 is found or not " + c.search(10));
    }
}
