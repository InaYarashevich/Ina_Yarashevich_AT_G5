package main.java.project.content;

public class Bubble {

    public static final double VOLUME = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public void burst() {
        System.out.print("Cramp!" + " ");
    }
}
