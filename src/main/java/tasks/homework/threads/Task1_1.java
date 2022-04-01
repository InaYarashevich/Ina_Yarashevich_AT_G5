package main.java.tasks.homework.threads;

import java.util.Random;
import java.util.stream.IntStream;

public class Task1_1 {

    public static void main(String[] args) {

        Random random = new Random();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.printf("thread-%s", i);
                System.out.println();
                IntStream.rangeClosed(1, 20).boxed().map(Mouse::new)
                        .forEach(Mouse::peep);
            }
        }).start();
    }
}
