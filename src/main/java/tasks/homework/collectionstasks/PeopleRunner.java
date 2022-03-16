package main.java.tasks.homework.collectionstasks;

import java.util.ArrayList;
import java.util.List;

public class PeopleRunner {

    public static void main(String[] args) throws NoSuchFieldException {
        People person1 = new People(32, "Коля");
        People person2 = new People(24, "Оля");
        People person3 = new People(55, "Вася");
        People person4 = new People(63, "Маша");

        List<People> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        for (People person : people) {
            System.out.print(person.getAge() + " ");
        }
        System.out.println();

        for (People person : people) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
