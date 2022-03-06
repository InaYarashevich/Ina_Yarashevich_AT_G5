package main.java.project.boxing;

import main.java.project.water.Bubble;
import main.java.project.water.SparklingWater;

public class Bottle {

    private double volume;
    SparklingWater water = new SparklingWater("no", "transparent", "no", 0);

    public Bottle(double volume) throws InterruptedException {
        this.volume = volume;
        Bubble[] bubbles = new Bubble[(int) (10000 * volume)];
        for (int i = 0; i < this.water.getBubbles().length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        this.water.pump(bubbles);
        System.out.println("----" + this.water.isSparkle() + "----");
    }

    public void open() {
        this.water.setOpened(true);
        System.out.print("Open the bottle ");
    }

    public void warm(int temperature) {
        this.water.setTemperature(temperature);
        System.out.printf("Warming water to: %s", temperature + " ").println();
    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
