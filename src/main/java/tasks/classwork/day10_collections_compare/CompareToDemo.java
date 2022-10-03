package tasks.classwork.day10_collections_compare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareToDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted((s1, s2) -> -s1.compareTo(s2))
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
