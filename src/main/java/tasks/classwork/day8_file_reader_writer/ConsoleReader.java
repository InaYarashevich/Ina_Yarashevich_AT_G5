package tasks.classwork.day8_file_reader_writer;

import java.util.Scanner;

public class ConsoleReader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String incoming = scanner.nextLine();
            System.out.printf("Just got '%s' text!", incoming).println();
            if ("stop".equalsIgnoreCase(incoming)){
                break;
            }
        }
    }
}
