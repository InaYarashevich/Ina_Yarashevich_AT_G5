package main.java.tasks.homework.collectionstasks;


import java.util.ArrayList;
import java.util.List;

public class People {

    public static void main(String[] args) throws NoSuchFieldException {
        People person1 = new People(32, "Коля");
        People person2 = new People(24, "Оля");
        People person3 = new People(55, "Вася");
        People person4 = new People(63, "Маша");

        List<Object> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        for (Object person : people) {
            System.out.print(person); //age
        }
        System.out.println();

        for (Object person : people) {
            System.out.print(person); //name
        }
        System.out.println();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }

    private int age;
    private String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
