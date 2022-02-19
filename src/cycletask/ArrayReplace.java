package cycletask;

import java.util.Arrays;

public class ArrayReplace {

    ArrayCreating arrayCreating = new ArrayCreating();

    public void printReorderedArray(){

        arrayCreating.fillOutArray();
        System.out.println(Arrays.toString(arrayCreating.array));

        int x = arrayCreating.array[0];
        arrayCreating.array[0] = arrayCreating.array[arrayCreating.array.length - 1];
        arrayCreating.array[arrayCreating.array.length -1] = x;
        System.out.println(Arrays.toString(arrayCreating.array));
    }
}
