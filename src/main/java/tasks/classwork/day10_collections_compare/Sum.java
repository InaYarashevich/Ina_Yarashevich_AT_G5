package tasks.classwork.day10_collections_compare;

import java.util.Arrays;
import java.util.List;

public class Sum {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream()
                .map(String::length)
                .mapToInt(p -> p % 2 == 1 ? p : 0)
                .sum());
    }
}
