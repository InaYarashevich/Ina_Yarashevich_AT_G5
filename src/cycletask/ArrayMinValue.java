package cycletask;

import java.util.Arrays;

public class ArrayMinValue {

    ArrayCreating arrayCreating = new ArrayCreating();

    public void findMin(){

        arrayCreating.fillOutArray();
        System.out.println(Arrays.toString(arrayCreating.array));

        int minValue = arrayCreating.array[0];

        for (int i = 0; i < arrayCreating.array.length; i++){
            if (arrayCreating.array[i] < minValue){
                minValue = arrayCreating.array[i];
            }
        }
        System.out.println(minValue);
    }

    @Override
    public String toString() {
        return "ArrayMinValue{" +
                "arrayCreating=" + arrayCreating +
                '}';
    }
}
