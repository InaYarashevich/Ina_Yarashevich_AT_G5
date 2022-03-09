package main.java.tasks.homework.inputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FilesWithRandomNumbers {

    public void inputRandomNumbers() throws IOException {

        BufferedWriter outFile1 = new BufferedWriter(
                new FileWriter("C:\\Users\\IT0054\\Ina_Yarashevich_AT_G5\\src\\main\\java\\tasks\\" +
                        "homework\\inputOutput\\folder1\\folder2\\folder3\\folder4\\file1.txt"));

        BufferedWriter outFile2 = new BufferedWriter(
                new FileWriter("C:\\Users\\IT0054\\Ina_Yarashevich_AT_G5\\src\\main\\java\\tasks\\" +
                        "homework\\inputOutput\\folder1\\folder2\\folder3\\folder4\\file2.txt"));

        Random randomInt = new Random();

        for (int i = 0; i < 10; i++){
            outFile1.write(randomInt.nextInt(10));
            outFile1.newLine();
            outFile2.write(randomInt.nextInt(10));
            outFile2.newLine();
        }
        outFile1.close();
        outFile2.close();
    }
}