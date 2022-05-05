package tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class FlatMapPeekMax {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().flatMap(s-> Arrays.stream(s.split("")))
                .peek(System.out::println)
                .max(String::compareTo)
                .get();
    }
}
