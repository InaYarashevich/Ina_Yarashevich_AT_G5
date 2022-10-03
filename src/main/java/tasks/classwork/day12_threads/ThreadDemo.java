package tasks.classwork.day12_threads;

import java.util.stream.IntStream;

public class ThreadDemo {

    public static void main(String[] args) {

        IntStream.range(1, 10).boxed().forEach(i -> System.out.println("pre-baraded" + i));

        new Thread(() -> {
            IntStream.range(1, 10).boxed().forEach(i -> System.out.println("pre-baraded" + i));
        }).start();

        IntStream.range(1, 1000).boxed().forEach(i -> System.out.println("post-baraded" + i));
    }
}
