package main.java.tasks.homework.stringtask;

import java.util.Objects;

public class RemovingDuplicates {

    public static void main(String[] args) {

        String task1 = "asdf1 word 234 563ad word";
        String[] array = task1.split(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
