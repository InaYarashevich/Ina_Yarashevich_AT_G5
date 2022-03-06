package main.java.tasks.homework.stringtask;

import java.util.Objects;

public class StringTask3 {

    public static void main(String[] args) {
        String logs = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied";

        String[] initialArray = logs.split("\n");
        String[][] newArray = new String[initialArray.length][3];

        for (int i = 0; i < initialArray.length; i++) {
            newArray[i] = initialArray[i].split(" ");
        }
    }
}
