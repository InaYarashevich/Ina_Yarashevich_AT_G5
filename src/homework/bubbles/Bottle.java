package homework.bubbles;

public class Bottle {

    private double volume;
 //   private boolean bottleIsOpened;
    Bubble[] bubbles;
    SparklingWater sparklingWater = new SparklingWater();

    public Bottle(double volume) {
        this.volume = volume;
        this.bubbles = new Bubble[(int) (10000 * volume)];
 //       this.bottleIsOpened = bottleIsOpened;
    }

    public void open() {
        sparklingWater.degas(bubbles);
    }
}
