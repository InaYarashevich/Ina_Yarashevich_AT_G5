package cycletask;

import java.util.Arrays;

public class ArraySort {

    ArrayCreating arrayCreating = new ArrayCreating();

    public void sortArray() {

        arrayCreating.fillOutArray();
        System.out.println(Arrays.toString(arrayCreating.array));

        for (int i = 0; i < arrayCreating.array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayCreating.array.length; j++) {

                if (arrayCreating.array[j] < arrayCreating.array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arrayCreating.array[i];
            arrayCreating.array[i] = arrayCreating.array[minIndex];
            arrayCreating.array[minIndex] = temp;
        }

        for (int j : arrayCreating.array) {
            System.out.print(j + " ");
        }
    }
}

