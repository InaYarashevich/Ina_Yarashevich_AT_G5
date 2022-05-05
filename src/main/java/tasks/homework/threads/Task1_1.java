package tasks.homework.threads;

import java.util.stream.IntStream;

public class Task1_1 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new)
                    .forEach(Mouse::peep);
        });

        Thread t2 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new)
                    .forEach(Mouse::peep);
        });

        Thread t3 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new)
                    .forEach(Mouse::peep);
        });

        Thread t4 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new)
                    .forEach(Mouse::peep);
        });

        Thread t5 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new)
                    .forEach(Mouse::peep);
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
