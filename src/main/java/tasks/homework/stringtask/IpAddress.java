package main.java.tasks.homework.stringtask;

public class IpAddress {

    public static void main(String[] args) {
        String logs = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied";

        String newLogs = logs.replaceAll("access_log.[0-9]{4}.[0-9]{2}.[0-9]{2}", "");
        String removedGranted = newLogs.replaceAll("granted", "");
        String removedFailed = removedGranted.replaceAll("denied", "").trim().replaceAll(" +", "");
        String[] initialArray = removedFailed.split("\n");
        String[] newArray = new String[initialArray.length];
        String grantedCount = "granted";
        String deniedCount = "denied";
        String uniqueIp;

        for (int i = 0; i < initialArray.length; i++) {
            for (int k = i + 1; k < initialArray.length; k++){
                if (!initialArray[i].equals(initialArray[k])) {
                    newArray[i] = initialArray[i];
                }
            }
        }

        for (String s : newArray) {
            System.out.println(s);
        }
    }
}
