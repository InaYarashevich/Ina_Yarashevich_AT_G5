package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;
import main.java.project.stuff.Bubble;
import main.java.project.stuff.SparklingWater;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {

    private double volume;
    private Transformable stuff;
    SparklingWater water = new SparklingWater("no", "transparent", "no", 5);

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
        this.setDiameter(2.0);
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < 10000 * volume; i++) {
            bubbles.add(new Bubble("CO2"));
        }
        this.water.pump(bubbles);
        System.out.println("Bottle is pumped with sparkling water.");
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
