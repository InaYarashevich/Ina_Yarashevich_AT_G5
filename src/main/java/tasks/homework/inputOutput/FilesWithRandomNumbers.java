package tasks.homework.inputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FilesWithRandomNumbers {

    public void inputRandomNumbers() throws IOException {

        BufferedWriter outFile1 = new BufferedWriter(
                new FileWriter("C:\\Users\\IT0054\\folder1\\folder2\\folder3\\folder4\\file1.txt"));

        BufferedWriter outFile2 = new BufferedWriter(
                new FileWriter("C:\\Users\\IT0054\\folder1\\folder2\\folder3\\folder4\\file2.txt"));

        int[] array = new int[10];
        Random randomInt = new Random();
        for (int i = 0; i < array.length; ++i)
            array[i] = randomInt.nextInt(20);

        for (int i = 0; i < array.length; i++){
            String number = Integer.toString(array[i]);
            outFile1.write(number);
            outFile1.newLine();
            outFile2.write(number);
            outFile2.newLine();
        }
        outFile1.close();
        outFile2.close();
    }
}
