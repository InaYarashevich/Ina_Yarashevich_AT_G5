package homework.cycletask;

import java.util.Random;

public class ArrayCreating {

    private static final Random RANDOM = new Random();

    private ArrayCreating(){}

    public static int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(100);
        }
        return array;
    }
}
