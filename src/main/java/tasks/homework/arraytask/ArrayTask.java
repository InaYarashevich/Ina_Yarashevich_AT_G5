package main.java.tasks.homework.arraytask;

import main.java.tasks.homework.cycletask.ArrayCreating;

public class ArrayTask {

    public void calculateSum(int n) {

        int[] array = ArrayCreating.createArray(10);
        int sum = 0;

        for (int i = n; i < array.length; i += n) {

            sum += array[i];
            System.out.println(sum);
        }
    }
}
