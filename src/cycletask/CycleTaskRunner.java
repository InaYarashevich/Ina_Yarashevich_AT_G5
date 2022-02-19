package cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {

        WhileCycleTask whileCycleTask = new WhileCycleTask();
        ForTask forTask = new ForTask();
        ArrayCreating arrayCreating = new ArrayCreating();
        ArrayPrinting arrayPrinting = new ArrayPrinting();
        ArrayReverseOrder arrayReverseOrder = new ArrayReverseOrder();
        ArrayMultiply arrayMultiply = new ArrayMultiply();
        ArrayMinValue arrayMinValue = new ArrayMinValue();
        ArraySquaring arraySquaring = new ArraySquaring();
        ArrayReplace arrayReorder = new ArrayReplace();
        ArraySort arraySort = new ArraySort();

        whileCycleTask.printNumbers();
        System.out.println();

        forTask.printNumbersFor();
        System.out.println();

        arrayCreating.fillOutArray();
        System.out.println();

        arrayPrinting.printArray();
        System.out.println();

        arrayReverseOrder.printReverseOrder();
        System.out.println();

        arrayMultiply.multiplyArray();
        System.out.println();

        arraySquaring.squareArray();
        System.out.println();

        arrayMinValue.findMin();

        arrayReorder.printReorderedArray();

        arraySort.sortArray();
    }
}
