package project.warehouse;

import project.vessel.Containable;

import java.util.List;

public class VesselBox {

    private String name;
    private int capacity;
    private List<Containable> box;
    private long id;

    public VesselBox(String name, int capacity, List<Containable> box, long id) {
        this.name = name;
        this.capacity = capacity;
        this.box = box;
        this.id = id;
    }

    public String getName() {
        return name = "I am box with <" + this.getCapacity() + "> <Bottles>";
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }

    public long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
