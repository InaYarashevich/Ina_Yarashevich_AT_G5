package main.java.project.runner;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Water;
import main.java.project.vessel.Bottle;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Water water = new SparklingWater("no", "no", "no", 0);
        water.setTemperature(5);
         Bottle bottle = new Bottle(0.5, 0.05, Material.GLASS);
       /* Bottle bottle2 = new Bottle(1);
        Bottle bottle3 = new Bottle(1.5);*/

        bottle.open();
        /*System.out.println();
        bottle2.open();
        System.out.println();
        bottle3.open();*/
    }
}