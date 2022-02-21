package homework.cycletask;

import java.util.Arrays;

public class ArrayPrinting {

    private int[] array = ArrayCreating.createArray(7);

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
        }
        System.out.print(Arrays.toString(array));
    }
}
