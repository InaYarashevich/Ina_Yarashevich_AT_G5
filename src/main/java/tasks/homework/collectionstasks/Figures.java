package main.java.tasks.homework.collectionstasks;

import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) {

        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        System.out.println(String.join(" - ", figures));

        int counter = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        //figures.add(3, "Треугольник");
        figures.set(3, "Треугольник");
        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}
