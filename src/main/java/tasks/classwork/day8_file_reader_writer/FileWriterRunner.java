package tasks.classwork.day8_file_reader_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterRunner {

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("мама мыла раму");
        out.close();
    }
}
