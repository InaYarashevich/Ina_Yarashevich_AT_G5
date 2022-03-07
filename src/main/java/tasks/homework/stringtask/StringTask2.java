package main.java.tasks.homework.stringtask;

public class StringTask2 {

    public static void main(String[] args) {

        String randomString = "asdf1 word 234 563ad word";
        String newString = randomString.replaceAll("[\\D+]", " ").trim();
        newString = newString.replaceAll(" +", "");
        String[] array = newString.split("");
        String[] numbersArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            numbersArray[i] = array[i];
            System.out.print(numbersArray[i]);
        }
    }
}
