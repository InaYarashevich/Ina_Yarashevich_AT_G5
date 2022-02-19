package cycletask;

import java.util.Arrays;

public class ArraySquaring {

    ArrayCreating arrayCreating = new ArrayCreating();

    public void squareArray() {

        arrayCreating.fillOutArray();
        System.out.println(Arrays.toString(arrayCreating.array));

        for (int j : arrayCreating.array) {
            System.out.print(j * j + " ");
        }
    }
}
