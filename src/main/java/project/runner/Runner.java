package main.java.project.runner;

import main.java.project.material.Material;
import main.java.project.stuff.Bubble;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Water;
import main.java.project.vessel.Bottle;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Bottle bottle = new Bottle(2, 0.05, Material.GLASS);

        List<Bubble> bubbles = new ArrayList<>();
        bottle.pump(bubbles);

        Water water = new SparklingWater(
                "no", "no", "no", 0, bubbles);

        bottle.addStuff(water);
        water.setTemperature(10);

        bottle.open();
    }
}