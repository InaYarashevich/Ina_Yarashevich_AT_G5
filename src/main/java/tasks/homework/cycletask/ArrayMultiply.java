package main.java.tasks.homework.cycletask;

public class ArrayMultiply {

    private int[] array = ArrayCreating.createArray(7);

    public void multiplyArray() {
        for (int i : array) {
            System.out.print(i * 5 + " ");
        }
    }
}
