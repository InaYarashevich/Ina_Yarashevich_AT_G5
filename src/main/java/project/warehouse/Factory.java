package main.java.project.warehouse;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;
import main.java.project.vessel.Bottle;
import main.java.project.vessel.Containable;

public class Factory {

    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> clazz){
        this.createVessel(1.2, Material.GLASS, stuff, Bottle.class);
    };

    private Containable createVessel(double volume, Material material, Transformable stuff, Class<?> clazz){
        return new Containable() {
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
        };
    }
}
