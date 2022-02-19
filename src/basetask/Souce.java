package basetask;

public class Souce {

    private String name;
    private String color;

    public Souce(){

    }

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSouceDetails(String name, String color){
        System.out.println( "Это соус " + name + " " + color + " цвета");
    }

    @Override
    public String toString() {
        return "Souce{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
