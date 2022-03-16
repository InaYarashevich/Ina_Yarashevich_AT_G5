package main.java.tasks.homework.collectionstasks;

import java.util.Arrays;
import java.util.List;

public class WaterRunner {

    public static void main(String[] args) {

        List<Water> water = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));

        for (Water waterType : water) {
            System.out.println(waterType.getColor() + "-вода");
        }
    }
}
