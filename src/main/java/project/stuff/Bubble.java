package main.java.project.stuff;

public class Bubble {

    public static final double VOLUME = 03;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.print("Cramp!" + " ");
    }

    public double getVolume() {
        return VOLUME;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "gas='" + gas + '\'' +
                '}';
    }
}