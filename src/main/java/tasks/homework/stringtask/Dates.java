package tasks.homework.stringtask;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

    public void convertDate(String dates) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("hh.mm dd.MM.yyyy");
        Date date = dateFormat.parse(dates);
        DateFormat dateFormat2 = new SimpleDateFormat("MMMM, d, y hh:mm");
        String newDate = dateFormat2.format(date);
        System.out.println(newDate);
    }
}
