package main.java.tasks.homework.streamtasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRead {

    public static void main(String[] args) throws IOException {

        List<String> myList = new ArrayList<>();
        Date date = new Date();

        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            myList.add(line);
        }
        in.close();

        Arrays.stream(myList.stream()
                        .skip(4)
                        .collect(Collectors.joining("<p>"))
                        .split("Date log:"))
                .map(s -> s.substring(0, 20) + " " + date)
                .forEach(System.out::println);
    }
}
