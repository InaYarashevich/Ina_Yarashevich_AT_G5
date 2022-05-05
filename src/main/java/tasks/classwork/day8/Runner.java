package tasks.classwork.day8;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        FileReadWriter myReadWriter = new FileReadWriter();

        myReadWriter.read();
        myReadWriter.write();
        myReadWriter.copyText("file.txt", "new_file.txt");
    }
}
