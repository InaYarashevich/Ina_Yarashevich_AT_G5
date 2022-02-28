package main.java.tasks.homework.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {

        new WhileCycleTask().printNumbers();
        System.out.println();
        new ForTask().printNumbersFor();
        ArrayCreating.createArray(7);
        System.out.println();
        new ArrayPrinting().printArray();
        System.out.println();
        new ArrayReverseOrder().printReverseOrder();
        System.out.println();
        new ArrayMultiply().multiplyArray();
        System.out.println();
        new ArrayMinValue().findMin();
        new ArraySquaring().squareArray();
        System.out.println();
        new ArrayReplace().printReorderedArray();
        new ArraySort().sortArray();
    }
}