package main.java.tasks.homework.collectionstasks;

import main.java.tasks.homework.classescreation.Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleRunner {

    public static void main(String[] args) throws NoSuchFieldException {
        Person person1 = new Person(32, "Коля");
        Person person2 = new Person(24, "Оля");
        Person person3 = new Person(55, "Вася");
        Person person4 = new Person(63, "Маша");

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        for (Person person : people) {
            System.out.print(person.getAge() + " ");
        }
        System.out.println();

        for (Person person : people) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
