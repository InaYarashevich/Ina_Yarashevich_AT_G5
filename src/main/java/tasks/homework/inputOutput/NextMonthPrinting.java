package main.java.tasks.homework.inputOutput;

import java.util.Scanner;

public class NextMonthPrinting {

    public final String JANUARY = "January";
    public final String FEBRUARY = "February";
    public final String MARCH = "March";
    public final String APRIL = "April";
    public final String MAY = "May";
    public final String JUNE = "June";
    public final String JULY = "July";
    public final String AUGUST = "August";
    public final String SEPTEMBER = "September";
    public final String OCTOBER = "October";
    public final String NOVEMBER = "November";
    public final String DECEMBER = "December";

    public void printNextMonth() {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        switch (month) {
            case JANUARY:
                System.out.println(FEBRUARY);
                break;
            case FEBRUARY:
                System.out.println(MARCH);
                break;
            case MARCH:
                System.out.println(APRIL);
                break;
            case APRIL:
                System.out.println(MAY);
                break;
            case MAY:
                System.out.println(JUNE);
                break;
            case JUNE:
                System.out.println(JULY);
                break;
            case JULY:
                System.out.println(AUGUST);
                break;
            case AUGUST:
                System.out.println(SEPTEMBER);
                break;
            case SEPTEMBER:
                System.out.println(OCTOBER);
                break;
            case OCTOBER:
                System.out.println(NOVEMBER);
                break;
            case NOVEMBER:
                System.out.println(DECEMBER);
                break;
            case DECEMBER:
                System.out.println(JANUARY);
                break;
        }
        System.out.println();
    }
}
