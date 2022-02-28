package main.java.tasks.classwork.day6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {

    public static void main(String[] args) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        Date date = dateFormat.parse("04.06.2020");

        String text = dateFormat.format(new Date());

        System.out.println(date.after(new Date()));
    }
}
