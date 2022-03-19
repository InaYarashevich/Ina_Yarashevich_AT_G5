package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );
        int counter = 0;
        for (Person person : personList) {
            if ((person.sex == Person.Sex.MAN && person.getAge() > 18 && person.getAge() < 60) ||
                    (person.sex == Person.Sex.WOMEN && person.getAge() > 18 && person.getAge() < 55)) {
                counter++;
            }
        }
        System.out.println(counter);

        long l = personList.stream().filter(
                person -> person.getAge() > 18).filter(person -> (person.getAge() < 55) ||
                (person.sex == Person.Sex.MAN && person.getAge() < 60)).count();
        System.out.println(l);
    }
}
