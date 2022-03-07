package main.java.tasks.homework.stringtask;

import java.util.Arrays;
import java.util.Objects;

public class StringTask3 {

    public static void main(String[] args) {
        String logs = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied";


        String newLogs = logs.replaceAll("access_log.[0-9]{4}.[0-9]{2}.[0-9]{2}", "");
        String removedOk = newLogs.replaceAll("granted", "");
        String removedFailed = removedOk.replaceAll("denied", "").trim().replaceAll(" +", "");
        String[] initialArray = removedFailed.split("\n");
        String[] newArray = new String[initialArray.length];
        String grantedCount = "granted";
        String deniedCount = "denied";
        String uniqueIp;

        for (int i = 0; i < initialArray.length; i++) {
            //uniqueIp = initialArray[i];
            for (int k = 0; k < newArray.length; k++){
                if (!newArray[k].equals(initialArray[i])) {
                    newArray[k] = initialArray[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
        for (String s : newArray) {
            System.out.println(s);
        }
    }
}
