package bubbles;

import java.util.ArrayList;
import java.util.Arrays;

public class SparklingWater extends Water {

    Bubble bubble = new Bubble();

    public SparklingWater(String color, String clarity, String smell, double temperature) {
        super(color, clarity, smell, temperature);
    }

    public SparklingWater() {
    }

    public void pump(Bubble[] bubbles) {

       for (int i = 0; i < bubbles.length; i++){
           bubbles[i] = new Bubble("CO2");
       }
    }

    public void degas(Bubble[] array) {



        int i = 0;
        int length = array.length;

        for (Bubble i1 : array) {

            for (int k = i; k < array.length - 1; k++) {
                array[k] = array[k + 1];
            }
            length--;

            bubble.burstBubble();

//            for (i = 0; i < length; i++)         //вывод элементов
//                System.out.print(array[i] + " ");
//            System.out.println("");
        }
    }
}
