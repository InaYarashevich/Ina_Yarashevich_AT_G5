package main.java.tasks.homework.inputOutput;

import java.io.*;

public class PrintingListOfFilesAndFolders {

    public void read() {

        File directory = new File("D:\\Java_AT_G5");
        for (String s : directory.list()) {
            System.out.println(s);
        }
    }
}
