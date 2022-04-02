package main.java.tasks.homework.threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1_4 {

    public static void main(String[] args) {

        List<Mouse> mouseList = IntStream.rangeClosed(1, 280)
                .boxed()
                .map(Mouse::new)
                .collect(Collectors.toList());

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                mouseList.remove(0).peep();
                try {
                    Thread.sleep(300);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
