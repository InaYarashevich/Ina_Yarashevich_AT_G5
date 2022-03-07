package main.java.tasks.classwork.day8;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        MyReadWriter myReadWriter = new MyReadWriter();

        myReadWriter.read();
        myReadWriter.write();
        myReadWriter.copyText("file.txt", "new_file.txt");
    }
}
