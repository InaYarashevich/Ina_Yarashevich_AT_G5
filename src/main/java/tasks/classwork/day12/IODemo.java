package main.java.tasks.classwork.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IODemo {

    public static void main(String[] args) {
        IODemo d = new IODemo();
    }

    private void method2(){

    };

    private void method3(){

    };

    private void method4(){

    };

    private void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
