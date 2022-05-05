package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Can extends Vessel implements Containable {

    private Transformable stuff;

    public Can(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, material);
        this.setDiameter(10.0);
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
