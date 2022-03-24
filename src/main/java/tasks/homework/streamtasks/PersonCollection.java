package main.java.tasks.homework.streamtasks;

import java.io.IOException;
import java.util.Random;
import java.util.stream.Stream;

public class PersonCollection {

    public static void main(String[] args) throws IOException {

        Random random = new Random();


        Stream.generate(() -> new Person("name", "surname", random.nextInt(30)))
                .limit(100)
                .forEach(System.out::println);

    }
}
