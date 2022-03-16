package main.java.tasks.homework.collectionstasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandRunner {

    public static void main(String[] args) {

        Sand sand1 = new Sand(2, "Речной");
        Sand sand2 = new Sand(4, "Речной");
        Sand sand3 = new Sand(2, "Карьерный");
        Sand sand4 = new Sand(7, "Речной");

        List<Sand> sandTypes = new ArrayList<>();

        sandTypes.add(sand1);
        sandTypes.add(sand2);
        sandTypes.add(sand3);
        sandTypes.add(sand4);

        for (Sand sandType : sandTypes) {
            System.out.print(sandType.getWeight() + " ");
        }
        System.out.println();

        for (Sand sandType : sandTypes) {
            System.out.print(sandType.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> sandMap = new HashMap<>();

        for (int i = 0; i < sandTypes.size(); i++) {
            sandMap.put(i, sandTypes.get(i));
        }

        for (int key : sandMap.keySet()) {
            System.out.println(key);
        }

        for (Sand sandObject : sandMap.values()) {
            System.out.println(sandObject);
        }

        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
