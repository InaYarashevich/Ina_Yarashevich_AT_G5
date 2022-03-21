package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().flatMap(s-> Arrays.stream(s.split(""))).count());
                                    //.map(s -> s.length()).reduce((x,y)->x+y).get();
                                        //(String::length)
                                    //.mapToInt(String::length).sum();
    }
}
