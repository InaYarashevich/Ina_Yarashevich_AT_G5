package main.java.tasks.homework.threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1_5 {

    public static void main(String[] args) {

        List<Mouse> mouseList = IntStream.rangeClosed(1, 380)
                .boxed()
                .map(Mouse::new)
                .collect(Collectors.toList());

        new Thread(() -> {
            for (int i = 0; i < 7; i++) {
                System.out.println(Thread.currentThread().getName());
                for (int k = 0; k < mouseList.size(); k++) {
                    if (mouseList.indexOf(k) % 2 != 0) {
                        mouseList.remove(k).peep();
                    }
                }
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
