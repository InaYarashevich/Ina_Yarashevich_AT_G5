package main.java.project.content;

public class Bubble {

    private double volume = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.print("Cramp!" + " ");
    }

    public double getVolume() {
        return volume;
    }
}
