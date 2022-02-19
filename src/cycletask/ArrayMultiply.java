package cycletask;

import java.util.Arrays;

public class ArrayMultiply {

    ArrayCreating arrayCreating = new ArrayCreating();

    public void multiplyArray(){

        arrayCreating.fillOutArray();
        System.out.println(Arrays.toString(arrayCreating.array));

        for (int j : arrayCreating.array) {
            System.out.print(j * 5 + " ");
        }
    }
}
