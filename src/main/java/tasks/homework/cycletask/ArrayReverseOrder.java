package main.java.tasks.homework.cycletask;

public class ArrayReverseOrder {

    private int[] array = ArrayCreating.createArray(7);

    public void printReverseOrder() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
