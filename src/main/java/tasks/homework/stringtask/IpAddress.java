package main.java.tasks.homework.stringtask;

public class IpAddress {

    public static void main(String[] args) {
        String logs = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.7 granted";

        String newLogs = logs.replaceAll("access_log.[0-9]{4}.[0-9]{2}.[0-9]{2}", "");
        String newLogsTrimmed = newLogs.trim();
        String removedGranted = newLogs.replaceAll("granted", "");
        String removedFailed = removedGranted.replaceAll("denied", "").trim().replaceAll(
                " +", "");
        String[] initialArray = removedFailed.split("\n");
        String[][] newArray = new String[initialArray.length][3];
        String[] arrayWithDeniedGranted = newLogsTrimmed.split("\n");
        String[][] newArr = new String[initialArray.length][3];
        int grantedCount = 0;
        int deniedCount = 0;
        int index = 0;

        for (int i = 0; i < initialArray.length; i++) {
            int flag = 0;
            for (int k = i + 1; k < initialArray.length; k++) {
                if (initialArray[i].equals(initialArray[k])) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                newArray[index][0] = initialArray[i];
                index++;
            }
        }

        for (int j = 0; j < arrayWithDeniedGranted.length; j++) {
            String newString = arrayWithDeniedGranted[j].trim();

            for (String[] strings : newArr) {
                newArr[j] = newString.split(" ");
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (newArr[j][1].contains("granted") && newArr[j][0].equals(newArray[i][0])) {
                    grantedCount += 1;
                    newArray[i][1] = String.valueOf(grantedCount);
                } else if (newArr[j][1].contains("denied") && newArr[j][0].equals(newArray[i][0])) {
                    deniedCount += 1;
                    newArray[i][2] = String.valueOf(deniedCount);
                }
            }
        }
    }
}
