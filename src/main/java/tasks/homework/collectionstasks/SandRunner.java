package tasks.homework.collectionstasks;

import tasks.homework.classescreation.Sand;

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

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(sand1);
        sandbox.add(sand2);
        sandbox.add(sand3);
        sandbox.add(sand4);

        for (Sand sandType : sandbox) {
            System.out.print(sandType.getWeight() + " ");
        }
        System.out.println();

        for (Sand sandType : sandbox) {
            System.out.print(sandType.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> sandMap = new HashMap<>();

        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(i, sandbox.get(i));
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
