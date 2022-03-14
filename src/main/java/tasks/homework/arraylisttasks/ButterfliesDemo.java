package main.java.tasks.homework.arraylisttasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ButterfliesDemo {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterfly : butterflies) {
            System.out.print(butterfly + " ");
        }

        int counter = 0;

        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        
        System.out.println();
        for (String butterfly : butterflies) {
            System.out.println(butterfly);
        }
    }
}
