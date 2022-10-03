package tasks.classwork.day12_threads;

import java.util.stream.IntStream;

public class ThreadDemo2 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t1: " + i));
            Thread.yield();
        });

        Thread t2 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t2: " + i));
        });

        Thread t3 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t3: " + i));
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
