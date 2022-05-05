package tasks.homework.arraytask;

public class Runner {

    public static void main(String[] args) {

        ArrayTask arrayTask = new ArrayTask();

        arrayTask.calculateSum(4);
        arrayTask.returnArray(5);
        System.out.println();
        arrayTask.calculateSumElem();
        arrayTask.drawCow();
    }
}
