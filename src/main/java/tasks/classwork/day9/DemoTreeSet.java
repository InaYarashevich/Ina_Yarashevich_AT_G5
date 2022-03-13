package main.java.tasks.classwork.day9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList1.add("myList1");
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList2.add("myList2");
        }

        System.out.println(System.currentTimeMillis() - t0);
    }
}
