package main.java.project.runner;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Water;
import main.java.project.vessel.Bottle;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Bottle bottle = new Bottle(5, 0.05, Material.GLASS);
        Water water = new SparklingWater("no", "no", "no", 0);

        bottle.addStuff(water);
        water.setTemperature(5);
        bottle.open();
    }
}