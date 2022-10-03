package tasks.classwork.day10_collections_compare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsGroupingByKeySet {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        people.stream()
                .collect(Collectors.groupingBy(p -> p.sex))
                .keySet()
                .forEach(System.out::println);
    }
}
