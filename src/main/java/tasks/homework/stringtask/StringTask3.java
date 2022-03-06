package main.java.tasks.homework.stringtask;

import java.util.Objects;

public class StringTask3 {

    public static void main(String[] args) {
        String logs = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied";

        String[] text = logs.split("\n");
        String[][] array = new String[text.length][3];
        String[] array2 = new String[text.length];

        for (int i = 0; i < text.length; i++) {
            array[i] = text[i].split(" ");
            for (int k = 0; k < array.length; k++) {
                if (Objects.equals(array[i][1], array2[k])) {
                    array2[k] = array[i][1];
                }
            }
            {
            }
        }
    }
}
