package main.java.project.boxing;

import main.java.project.water.Bubble;
import main.java.project.water.SparklingWater;

public class Bottle {

    private double volume;
    SparklingWater water = new SparklingWater("no", "transparent", "no", 0);

    public Bottle(double volume) throws InterruptedException {
        this.volume = volume;
        this.water.setBubbles(new Bubble[(int) (10000 * volume)]);
        this.water.pump(getWater().getBubbles());
        System.out.print("-Initializing the Bottle object-");
    }

    public void open() {
        this.water.setOpened(true);
        System.out.print("-Opening of the bottle-");
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
