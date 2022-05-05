package project.runner;

import project.material.Material;
import project.stuff.Bubble;
import project.stuff.SparklingWater;
import project.stuff.Water;
import project.vessel.Bottle;

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