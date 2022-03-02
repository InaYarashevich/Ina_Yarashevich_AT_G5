package main.java.tasks.homework.stringtask;

import java.util.Arrays;
import java.util.Objects;

public class StringTask3 {

    public static void main(String[] args) {
       String logs = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied";

        String[] array = logs.split(" ");
        int passed_count = 0;
        int failed_count = 0;
        String ip_address = null;


        for (String s : array) {
            if (s.contains("granted")) {
                passed_count += 1;
            }
            if (s.contains("denied")) {
                failed_count += 1;
            }
            if (s.matches("\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b")) {
                ip_address = s;

            }
        }

        System.out.println("ip " + ip_address + ": ok - " + passed_count + ", failed - " + failed_count);
    }
}

