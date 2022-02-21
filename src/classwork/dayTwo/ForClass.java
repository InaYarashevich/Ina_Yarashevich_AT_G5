package classwork.dayTwo;
import java.util.Random;
public class ForClass {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++){
           array[i] = random.nextInt(100);
        }

        int sum = 0;
        int e = 0;
        for (int i: array){
            sum += i;
            e = i;
        }

        System.out.println("Average is " + sum / array.length);
    }
}
// int avg = 0;
//for (int i = 0; i < array.length; i++){
//    avg + =array[i];
//       }