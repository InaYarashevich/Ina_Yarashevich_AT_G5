package main.java.tasks.homework.stringtask;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class StringTask4 {

    DateFormat dateFormat = new SimpleDateFormat("hh.mm dd.MM.yyyy");
    String text = dateFormat.format(new Date());

    public void printDate(String text){

        System.out.println();
    }
}
