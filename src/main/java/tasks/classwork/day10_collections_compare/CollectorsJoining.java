package tasks.classwork.day10_collections_compare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoining {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().collect(Collectors.joining(":", "<p>", "/<p>")));
    }
}
