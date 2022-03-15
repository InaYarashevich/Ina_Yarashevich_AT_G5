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
        for (String bird : birds) {
            if (bird.matches("[аиеёоюуыэя\\p{IsCyrillic}]+")) {
                counter++;
            }
        }
        System.out.println(counter);

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
