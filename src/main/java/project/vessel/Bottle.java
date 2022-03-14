package main.java.project.vessel;

import main.java.project.containable.Containable;
import main.java.project.material.Material;
import main.java.project.transformable.Transformable;
import main.java.project.water.Bubble;
import main.java.project.water.SparklingWater;

public class Bottle extends Vessel implements Containable {

    private double volume;
    SparklingWater water = new SparklingWater("no", "transparent", "no", 0);

    public Bottle(double volume, double diameter, int weight, Material material) throws InterruptedException {
        super(volume, diameter, weight, material);
        Bubble[] bubbles = new Bubble[(int) (10000 * volume)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        this.water.pump(bubbles);
    }

    public void warm(int temperature) {
        this.water.setTemperature(temperature);
        System.out.printf("Warming water to: %s", temperature + " ").println();
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open() {
        this.water.setOpened(true);
        System.out.print("Open the bottle ");
    }

    @Override
    public void close() {

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
