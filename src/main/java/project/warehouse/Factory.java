package main.java.project.warehouse;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;
import main.java.project.vessel.Containable;

public class Factory {

    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> clazz){};
/*
    private Containable createVessel(double volume, Material material, Transformable stuff, Class<?> clazz){

    }*/
}
