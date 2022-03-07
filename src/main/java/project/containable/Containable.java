package main.java.project.containable;

import main.java.project.transformable.Transformable;

public interface Containable {

    void addStuff(Transformable stuff);

    Transformable removeStuff();

    boolean isEmpty();

    int getFreeSpace();

    void open();

    void close();
}
