package cycletask;

import java.util.Arrays;

public class ArrayReverseOrder {

    ArrayCreating arrayCreating = new ArrayCreating();

    public void printReverseOrder() {

        arrayCreating.fillOutArray();
        System.out.println(Arrays.toString(arrayCreating.array));

        for (int i = arrayCreating.array.length - 1; i >= 0; i--) {
            System.out.print(arrayCreating.array[i] + " ");
        }
    }
}
