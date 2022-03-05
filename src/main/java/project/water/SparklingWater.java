package main.java.project.water;

import java.util.Arrays;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) throws InterruptedException {
        super(color, transparency, smell, temperature);
        this.isOpened();
        System.out.print("-Initializing SparklingWater-");
    }

    public void pump(Bubble[] bubbles) {
        for (int i = 0; i < this.bubbles.length; i++) {
            this.bubbles[i] = new Bubble("CO2");
        }
        System.out.print("-Adding bubbles to water-" + Arrays.toString(bubbles) + "-");
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        System.out.print("-Setting the Bottle as Opened-" + isOpened + " ");
    }

    private void isOpened() throws InterruptedException {
        if (isOpened) {
            degas();
        }
        System.out.print("-Checking if the Bottle is Opened and running degas-");
    }

    private void degas() throws InterruptedException {

        int bubblesNumber = 10 + 5 * this.getTemperature();
        for (int i = 0; i < bubblesNumber; i++) {
            assert bubbles[i] != null;
            bubbles[i].cramp();
            bubbles[i] = null;
        }
        Thread.sleep(1000);
        System.out.print("-Degas this sparkling water -");
    }

/*    public boolean isSparkle(){
        return ;
    }
*/

    public Bubble[] getBubbles() {
        System.out.print("-Getting the bubbles array - " + Arrays.toString(bubbles) + "-");
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
        System.out.print("-Initializing the Bubbles array-");
    }

}