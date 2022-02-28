package main.java.project.boxing;

import main.java.project.content.Bubble;
import main.java.project.content.SparklingWater;

public class Bottle {

    private double volume;
    SparklingWater sparklingWater = new SparklingWater();

    public Bottle(double volume) {
        this.volume = volume;
        this.sparklingWater.setBubbles(new Bubble[(int) (10000 * volume)]);
        this.sparklingWater.pump();
    }

    public void open() {
        sparklingWater.degas();
    }

    public void warm(int temperature) {
        this.sparklingWater.setTemperature(temperature);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public SparklingWater getSparklingWater() {
        return sparklingWater;
    }

    public void setSparklingWater(SparklingWater sparklingWater) {
        this.sparklingWater = sparklingWater;
    }
}
