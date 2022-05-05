package tasks.homework.inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordsCounting {

    public void countWords() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\IT0054\\folder1\\test1.txt"));
        String line = in.readLine();
        String wordsLine = line.replaceAll("[^a-zA-Z]", " ").trim();
        String removedLetters = line.replaceAll("[a-zA-Z]", "").trim();
        String removedNumbers = removedLetters.replaceAll("\\d", "").trim();
        String[] wordsArray = wordsLine.split(" ");
        String[] punctuationArray = removedNumbers.split(" ");

        int wordsCount = 0;
        int punctuationCount = 0;
        int sum = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].matches("[a-zA-Z]+")) {
                wordsCount += 1;
            }
        }
        for (int i = 0; i < punctuationArray.length; i++) {
            if (punctuationArray[i].matches("\\p{Punct}")) {
                punctuationCount += 1;
            }
        }
        sum = wordsCount + punctuationCount;
        System.out.println("Сумма количества знаков препинания и слов равна: " + sum);
        in.close();
    }
}
