package tasks.classwork.day10_collections_compare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().anyMatch("мама"::equals));
        System.out.println(list.stream().allMatch(x -> x.contains("м")));
        list.stream().map(s -> s + "м").collect(Collectors.toList()).forEach(System.out::println);
        list.stream().flatMap(s -> Arrays.stream(
                s.split("а"))).filter(s -> !s.equals("")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
