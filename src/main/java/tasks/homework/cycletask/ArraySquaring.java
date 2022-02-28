package main.java.tasks.homework.cycletask;

public class ArraySquaring {

    private int[] array = ArrayCreating.createArray(7);

    public void squareArray() {
        for (int i : array) {
            System.out.print(i * i + " ");
        }
    }
}
