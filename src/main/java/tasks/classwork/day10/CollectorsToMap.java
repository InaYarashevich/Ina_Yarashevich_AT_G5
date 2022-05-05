package tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToMap {

    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        System.out.println(people.stream().collect(Collectors.toMap(person -> person.hashCode(), person -> person)));
    }
}
