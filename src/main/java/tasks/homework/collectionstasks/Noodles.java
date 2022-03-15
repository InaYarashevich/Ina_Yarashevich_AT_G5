package main.java.tasks.homework.collectionstasks;

import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodlesType : noodles) {
            System.out.print(noodlesType + "—");
        }
        System.out.println();

        for (String noodlesType : noodles) {
            String newNoodles = noodlesType.replace("a", "o");
            System.out.print(newNoodles + " ");
        }
        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
