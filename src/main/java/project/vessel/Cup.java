package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;

public class Cup extends Vessel implements Containable {

    private Transformable stuff;

    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, material);
        this.setDiameter(8.0);
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

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void warm(int temperature) {

    }
}
