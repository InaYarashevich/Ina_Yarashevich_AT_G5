package tasks.homework.cycletask;

import java.util.Arrays;

public class ArrayReplace {

    private int[] array = ArrayCreating.createArray(7);

    public void printReorderedArray() {
        int x = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = x;
        System.out.println(Arrays.toString(array));
    }
}
