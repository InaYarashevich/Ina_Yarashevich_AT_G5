package cycletask;

import java.util.Arrays;

public class ArrayPrinting {

    ArrayCreating arrayCreating = new ArrayCreating();

    public void printArray() {
        arrayCreating.fillOutArray();

        for (int i = 0; i < arrayCreating.array.length; i++) {
        }
        System.out.print(Arrays.toString(arrayCreating.array));
    }
}
