package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Bubble;
import main.java.project.stuff.Transformable;

import java.util.List;

public class Bottle extends Vessel implements Containable {

    private double volume;
    private Transformable stuff;

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
        setDiameter(2.0);
    }

    public void pump(List<Bubble> bubbles){
        for (int i = 0; i < 10000 * this.volume; i++) {
            bubbles.add(new Bubble("CO2"));
        }
        System.out.println("Pumping the bottle with Bubbles");
    }

    @Override
    public void warm(int temperature) {
        stuff.setTemperature(temperature);
        System.out.printf("Warming water to: %s", temperature + " ").println();
    }

    @Override
    public void addStuff(Transformable stuff) {
        this.stuff = stuff;
    }

    @Override
    public Transformable removeStuff() {
        return stuff = null;
    }

    @Override
    public boolean isEmpty() {
        return stuff == null;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open() {
        stuff.setOpened(true);
        System.out.println("Open the bottle ");
    }

    @Override
    public void close() {

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "volume=" + volume +
                ", stuff=" + stuff +
                '}';
    }
}
