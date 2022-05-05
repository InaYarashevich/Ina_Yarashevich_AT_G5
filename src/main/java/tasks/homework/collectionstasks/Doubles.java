package tasks.homework.collectionstasks;

import java.util.Arrays;
import java.util.List;

public class Doubles {
    public static void main(String[] args) {

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (Double doubleNumber : doubles) {
            System.out.print(doubleNumber + " ");
        }
        System.out.println();

        double multiplication = 1;
        for (Double doubleNumber : doubles) {
            multiplication *= doubleNumber;
        }
        System.out.println(multiplication);

        double sum = 0;
        for (Double doubleNumber : doubles) {
            double fractionalPart = doubleNumber % 1;
            sum += fractionalPart;
        }
        System.out.println(sum);

        for (int i = 0; i < doubles.size(); i++) {
            double fractionalPart = doubles.get(i) % 1;
            double integerPart = doubles.get(i) - fractionalPart;
            System.out.print(integerPart + " ");
        }
    }
}
