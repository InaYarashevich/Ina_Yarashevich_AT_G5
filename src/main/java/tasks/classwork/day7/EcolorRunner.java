package tasks.classwork.day7;

import java.util.Locale;

public class EcolorRunner {

    public static void main(String[] args) {

        isColor("red");

    }

    private static void isColor(String color) {

        switch (Ecolor.valueOf(color.toUpperCase(Locale.ROOT))) {
            case RED:
                System.out.println(Ecolor.RED.name + ": " + Ecolor.RED.hex);
                break;
            case BLUE:
                System.out.println(ColorContainer.BLUE.COLOR + ": " + ColorContainer.BLUE.HEX);
                break;
            case GREEN:
                System.out.println(ColorContainer.GREEN.COLOR + ": " + ColorContainer.GREEN.HEX);
                break;
            case YELLOW:
                System.out.println(ColorContainer.YELLOW.COLOR + ": " + ColorContainer.YELLOW.HEX);
                break;
            case PURPLE:
                System.out.println(ColorContainer.PURPLE.COLOR + ": " + ColorContainer.PURPLE.HEX);
                break;
        }
    }
}
