package tasks.classwork.day9_arrayList_linkedList_hashSet_hashMap_treeSet;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

    public static void main(String[] args) {

        String[] array = "мама мыла раму мыла".split(" ");

        Map<Integer, String> words = new HashMap<Integer, String>();

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }

        for (int i : words.keySet()) {
            System.out.println(i);
        }

        for (String word : words.values()) {
            System.out.println(word);
        }

        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
