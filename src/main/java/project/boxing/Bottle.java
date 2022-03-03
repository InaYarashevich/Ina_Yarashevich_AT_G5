package main.java.project.boxing;

import main.java.project.water.Bubble;
import main.java.project.water.SparklingWater;

public class Bottle {

    private double volume;
    SparklingWater sparklingWater = new SparklingWater();

    public Bottle(double volume) {
        this.volume = volume;
        this.sparklingWater.setBubbles(new Bubble[(int) (10000 * volume)]);
    }

    public void open(){
        this.sparklingWater.setOpened(true);
    }

    public void warm(int temperature) {
        this.sparklingWater.setTemperature(temperature);
    }

    public SparklingWater getWater(){
        return new SparklingWater();
    }

    public void setWater(SparklingWater water){
        this.sparklingWater = water;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
