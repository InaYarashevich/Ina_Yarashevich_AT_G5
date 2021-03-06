package tasks.homework.inputOutput;

import java.io.IOException;
import java.text.ParseException;

public class Runner {

    public static void main(String[] args) throws ParseException, IOException {

        NextMonthPrinting nextMonthPrinting = new NextMonthPrinting();
        PrintingListOfFilesAndFolders filesFoldersList = new PrintingListOfFilesAndFolders();
        WordsCounting wordsCounting = new WordsCounting();
        FilesWithRandomNumbers filesWithRandomNumbers = new FilesWithRandomNumbers();

        filesFoldersList.read();
        filesWithRandomNumbers.inputRandomNumbers();
        wordsCounting.countWords();
        nextMonthPrinting.printNextMonth();
    }
}
