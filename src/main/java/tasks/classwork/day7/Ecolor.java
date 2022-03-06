package main.java.tasks.classwork.day7;

public enum Ecolor {

    RED("red", 1),
    BLUE("blue", 2),
    GREEN("green", 3),
    YELLOW("yellow", 4),
    PURPLE("purple", 5);

    String name;
    int hex;

    Ecolor(String name, int hex){
        this.name = name;
        this.hex = hex;
    }
}
