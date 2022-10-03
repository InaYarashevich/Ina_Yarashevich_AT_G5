package tasks.classwork.day10_collections_compare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareToPerson {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        people.stream().sorted((p1, p2) -> {
                    if (p1.sex != p2.sex) {
                        return p1.sex.compareTo(p2.sex);
                    } else {
                        return p1.getAge() - p2.getAge();
                    }
                })
                .peek(person -> System.out.println(person.getName()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
