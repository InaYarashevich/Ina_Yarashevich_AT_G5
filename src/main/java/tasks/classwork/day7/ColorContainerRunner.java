package main.java.tasks.classwork.day7;

public class ColorContainerRunner {

    public static void main(String[] args) {

    }

    private static void printColor(String color){
        switch (color){
            case "red":
                System.out.println(ColorContainer.RED.COLOR + ColorContainer.RED.HEX);
                break;
            case "blue":
                System.out.println(ColorContainer.BLUE.COLOR + ColorContainer.BLUE.HEX);
                break;
            case "green":
                System.out.println(ColorContainer.GREEN.COLOR + ColorContainer.GREEN.HEX);
                break;
            case "yellow":
                System.out.println(ColorContainer.YELLOW.COLOR + ColorContainer.YELLOW.HEX);
                break;
            case "purple":
                System.out.println(ColorContainer.PURPLE.COLOR + ColorContainer.PURPLE.HEX);
                break;
        }
        System.out.println();
    }
}
