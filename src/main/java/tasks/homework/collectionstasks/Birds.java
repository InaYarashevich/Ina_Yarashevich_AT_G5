package main.java.tasks.homework.collectionstasks;

import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        int counter = 0;
        int birdsCount = 0;
        for (String bird : birds) {
            if (bird.contains("а") || bird.contains("о") || bird.contains("у") ||
                    bird.contains("э") || bird.contains("ю") || bird.contains("ы") ||
                    bird.contains("ё") || bird.contains("я") || bird.contains("и") ||
                    bird.contains("е")) {
                counter++;
            }
            if (counter > 1) {
                birdsCount++;
            }
        }
        System.out.println(birdsCount);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(3, "Синица");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
