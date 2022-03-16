package main.java.tasks.homework.collectionstasks;

import java.util.Arrays;
import java.util.List;

public class BubblesRunner {

    public static void main(String[] args) {

        Bubbles bubble1 = new Bubbles(2, "CO2");
        Bubbles bubble2 = new Bubbles(4, "O2");
        Bubbles bubble3 = new Bubbles(5, "CO");

        List<Bubbles> bubbles = Arrays.asList(bubble1, bubble2, bubble3);

        for (Bubbles bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();

        for (Bubbles bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();

        int sum = 0;
        for (Bubbles bubble : bubbles) {
            sum += bubble.getVolume();
        }
        System.out.println(sum);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i));
        }
    }
}
