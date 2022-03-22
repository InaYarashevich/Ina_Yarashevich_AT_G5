package main.java.tasks.homework.streamtasks;

import java.util.stream.IntStream;

public class GeneratedIntCollection {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 45)
                .filter(num -> (num % 3 == 0) && (num % 5 == 0))
                .forEach(System.out::println);
    }
}
