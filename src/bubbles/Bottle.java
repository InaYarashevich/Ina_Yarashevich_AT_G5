package bubbles;

public class Bottle {

    private double volume;
    Bubble[] bubbles;
    SparklingWater sparklingWater = new SparklingWater();

    public Bottle(double volume) {
        this.volume = volume;
        this.bubbles = new Bubble[(int) (10000 * volume)];
    }

    public void open() {

        sparklingWater.degas(new Bubble[10000]);
    }
}
