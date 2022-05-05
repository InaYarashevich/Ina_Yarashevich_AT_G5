package project.warehouse;

import project.material.Material;
import project.stuff.Transformable;
import project.vessel.Containable;

public class Factory {

    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> clazz){
        createVessel(capacity, material, stuff, clazz);
    };

    private Containable createVessel(double volume, Material material, Transformable stuff, Class<?> clazz){
        return new Containable() {

            @Override
            public void addStuff(Transformable stuff) {

            }

            @Override
            public Transformable removeStuff() {
                return stuff;
            }

            @Override
            public boolean isEmpty() {
                return stuff == null;
            }

            @Override
            public int getFreeSpace() {
                return 0;
            }

            @Override
            public void open() {
                stuff.setOpened(true);
            }

            @Override
            public void close() {
                stuff.setOpened(false);
            }

            @Override
            public void warm(int temperature) {
                stuff.setTemperature(temperature);
            }
        };
    }
}
