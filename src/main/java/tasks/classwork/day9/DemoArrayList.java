package main.java.tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        String[] array = "мама мыла раму".split(" ");

        for (String s : array) {
            myList.add(s);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for (String s : myList) {
            System.out.println(s);
        }
    }
}
