package homework.cycletask;

import java.util.Random;

public class ArrayCreating {

    private static final Random random = new Random();

    public static int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
