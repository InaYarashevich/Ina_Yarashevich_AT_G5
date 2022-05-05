package tasks.homework.collectionstasks;

import tasks.homework.classescreation.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChairRunner {

    public static void main(String[] args) {

        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4));


        for (Chair chairType : furniture) {
            System.out.print(chairType.getHeight() * chairType.getWidth() + " ");
        }
        System.out.println();

        Map<Integer, Chair> chairMap = new HashMap<>();

        for (int i = 0; i < furniture.size(); i++) {
            chairMap.put(i, furniture.get(i));
        }

        for (int key : chairMap.keySet()) {
            System.out.println(key);
        }

        for (Chair chairType : chairMap.values()) {
            System.out.println(chairType);
        }

        for (Map.Entry<Integer, Chair> entry : chairMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
