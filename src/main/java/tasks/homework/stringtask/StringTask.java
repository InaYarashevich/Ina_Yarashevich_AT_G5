package main.java.tasks.homework.stringtask;

import java.util.Objects;

public class StringTask {

    public static void main(String[] args) {

        String task1 = "asdf word asdf word 234 563 asdf word word";

        String[] array = task1.split(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Objects.equals(array[i], array[j])) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
