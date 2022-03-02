package main.java.tasks.homework.stringtask;

import java.util.Arrays;

public class StringTask2 {

    public static void main(String[] args) {

        String task1 = "asdf1 word 234 563ad word";
        String s = task1.replaceAll("[^\\d]", " ");
        s = s.trim();
        s = s.replaceAll(" +", "");
        String[] array2 = s.split("");
        int[] intArray = new int[array2.length];

        for (int i = 0; i < array2.length; i++) {
            intArray[i] = Integer.parseInt(array2[i]);
        }
        System.out.println(Arrays.toString(intArray));
    }
}
