package tasks.homework.cycletask;

public class ArraySort {

    private int[] array = ArrayCreating.createArray(7);

    public void sortArray() {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}

