package main.java.tasks.classwork.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyReadWriter {

    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
