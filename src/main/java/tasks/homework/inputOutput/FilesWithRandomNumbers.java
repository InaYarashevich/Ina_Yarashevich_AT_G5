package main.java.tasks.homework.inputOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class FilesWithRandomNumbers {

    public void inputRandomNumbers() throws IOException {

        BufferedWriter outputFile1 = new BufferedWriter(new FileWriter("C:\\Users\\IT0054\\Ina_Yarashevich_AT_G5\\src\\main\\java\\tasks\\" +
                "homework\\inputOutput\\folder1\\folder2\\folder3\\folder4\\file1.txt", StandardCharsets.UTF_8));

        BufferedWriter outputFile2 = new BufferedWriter(
                new FileWriter("C:\\Users\\IT0054\\Ina_Yarashevich_AT_G5\\src\\main\\java\\tasks\\" +
                "homework\\inputOutput\\folder1\\folder2\\folder3\\folder4\\file2.txt", StandardCharsets.UTF_8));

        Random randomInt = new Random();

        for (int i = 0; i < 10; i++){
            outputFile1.write(i);
            outputFile1.newLine();

            outputFile2.write(randomInt.nextInt(10));
            outputFile2.newLine();
        }
        outputFile1.close();
        outputFile2.close();
    }
}
