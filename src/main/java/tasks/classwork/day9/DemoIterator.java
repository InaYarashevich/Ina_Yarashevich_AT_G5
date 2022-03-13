package main.java.tasks.classwork.day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoIterator {

    public static void main(String[] args) {

        Set<String> myList = new HashSet<>();

        String[] array = "мама мыла раму мыла".split(" ");

        for (String s : array) {
            myList.add(s);
        }

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : myList) {
            System.out.println(s);
        }
    }
}
