package homework.basetask;

public class Souce {

    private String name;
    private String color;

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printSouceDetails() {

        System.out.println("Это соус " + name + " " + color + " цвета");
    }

    @Override
    public String toString() {
        return "Souce{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
