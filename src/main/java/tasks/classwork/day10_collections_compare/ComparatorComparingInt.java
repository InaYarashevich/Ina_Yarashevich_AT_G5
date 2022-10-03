package tasks.classwork.day10_collections_compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparingInt {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        System.out.println(people.stream().min(Comparator.comparingInt(Person::getAge)).get());
    }
}
