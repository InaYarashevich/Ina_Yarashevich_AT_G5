package main.java.project.water;

public class Bubble {

    private double volume = 0.3;
    private String gas = "CO2";

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.print("Cramp!" + " ");
        System.out.print("Cramping the bubble ");
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "gas='" + gas + '\'' +
                '}';
    }
}