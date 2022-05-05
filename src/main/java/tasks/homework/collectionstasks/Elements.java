package tasks.homework.collectionstasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Elements {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        int counter = 0;
        for (String element : elements) {
            if (element.trim().contains(" ")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
