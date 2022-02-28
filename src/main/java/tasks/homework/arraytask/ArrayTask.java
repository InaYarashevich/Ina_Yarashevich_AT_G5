package main.java.tasks.homework.arraytask;

import main.java.tasks.homework.cycletask.ArrayCreating;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArrayTask {

    public void calculateSum(int n) {

        int[] array = ArrayCreating.createArray(10);
        int sum = 0;

        for (int i = n; i < array.length; i += n) {

            sum += array[i];
            System.out.println(sum);
        }
    }

    public void returnArray(int n) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                array2[i] = array[i];
            }
        }
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i] + " ");
        }
    }

    public void calculateSumElem() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 28, 56, 28};
        int sum = 0;
        DateFormat dateFormat = new SimpleDateFormat("dd");
        String text = dateFormat.format(new Date());
        int dayNumber = Integer.parseInt(text);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % dayNumber == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
