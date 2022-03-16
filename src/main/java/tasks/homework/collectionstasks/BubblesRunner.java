package main.java.tasks.homework.collectionstasks;

import main.java.tasks.homework.classescreation.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubblesRunner {

    public static void main(String[] args) {

        Bubble bubble1 = new Bubble(2, "CO2");
        Bubble bubble2 = new Bubble(4, "O2");
        Bubble bubble3 = new Bubble(5, "CO");

        List<Bubble> bubbles = Arrays.asList(bubble1, bubble2, bubble3);

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();

        int sum = 0;
        for (Bubble bubble : bubbles) {
            sum += bubble.getVolume();
        }
        System.out.println(sum);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i));
        }
    }
}
