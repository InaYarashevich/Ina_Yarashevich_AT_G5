package main.java.tasks.homework.collectionstasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Cars {

    public static void main(String[] args) throws IOException, InterruptedException {

        Set<String> cars = new HashSet<>();
        BufferedWriter output = new BufferedWriter(
                new FileWriter("C:\\Users\\IT0054\\Ina_Yarashevich_AT_G5\\src\\" +
                        "main\\java\\tasks\\homework\\arraylisttasks\\cars.txt"));

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        for (String car : cars) {
            output.write("\"" + car + "\"");
            output.newLine();
        }
        output.close();

        cars.removeIf(car -> car.length() > 4);

        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
