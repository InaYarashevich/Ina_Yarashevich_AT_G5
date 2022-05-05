package project.vessel;

import project.material.Material;
import project.stuff.Bubble;
import project.stuff.Transformable;

import java.util.List;

public class Bottle extends Vessel implements Containable {

    private Transformable stuff;

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
        setDiameter(2.0);
    }

    public void pump(List<Bubble> bubbles){
        for (int i = 0; i < 10000 * getVolume(); i++) {
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
        stuff.setOpened(false);
    }
}
