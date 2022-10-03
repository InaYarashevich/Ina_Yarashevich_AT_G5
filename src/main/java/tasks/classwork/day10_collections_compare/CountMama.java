package tasks.classwork.day10_collections_compare;

import java.util.Arrays;
import java.util.List;

public class CountMama {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        long countMama = list.stream().filter("мама"::equals).count();
        System.out.println(countMama);

        list.forEach(System.out::println);
    }
}
