package main.java.tasks.homework.streamtasks;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonCollection {

    public static void main(String[] args) throws IOException {

        Random random = new Random();

        Stream.generate(() -> new Person("name" + random.nextInt(100),
                        "surname" + random.nextInt(100),
                        random.nextInt(30)))
                .limit(100)
                .filter(person -> person.getAge() < 21)
                .peek(person -> System.out.println(person.getName() + " " + person.getAge()))
                .sorted(Comparator.comparing(Person::getSurname)
                        .thenComparing(Person::getName))
                .limit(4)
                .map(Person::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println); 
    }
}