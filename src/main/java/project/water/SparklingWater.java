package main.java.project.water;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) throws InterruptedException {
        super(color, transparency, smell, temperature);
        this.isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        System.out.print("Set the Bottle as Opened ");
    }

    private void isOpened() throws InterruptedException {
        if (isOpened) {
            degas();
        }
        System.out.print("Run degas if Bottle is opened ");
    }

    private void degas() throws InterruptedException {

        int bubblesNumber = 10 + 5 * this.getTemperature();
        for (int i = 0; i < bubblesNumber; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
        }
        Thread.sleep(1000);
        System.out.print("Degas this sparkling water ");
    }

    public boolean isSparkle() {
        return bubbles[bubbles.length - 1] == null;
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

}