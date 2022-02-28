package main.java.tasks.homework.cycletask;

public class ArrayMinValue {
    private int[] array = ArrayCreating.createArray(7);

    public void findMin() {
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println(minValue);
    }

    @Override
    public String toString() {
        return "ArrayMinValue{" +
                "arrayCreating=" + array +
                '}';
    }
}
