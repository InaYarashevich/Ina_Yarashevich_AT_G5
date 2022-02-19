package cycletask;

import java.util.Arrays;
import java.util.Random;

public class ArrayCreating {

    int[] array = new int[7];
    Random random = new Random();

    public ArrayCreating(){}

    public ArrayCreating(int[] array, Random random) {
        this.array = array;
        this.random = random;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int[] fillOutArray(){
        for (int i = 0; i < 7; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }

    @Override
    public String toString() {
        return "ArrayCreating{" +
                "array=" + Arrays.toString(array) +
                ", random=" + random +
                '}';
    }
}
